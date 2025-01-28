package controlador;

import Interfaz.InterfazGRafica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Proelectrico;
import modelo.ProelectricoDAO;

public class Controlador implements ActionListener {

    ProelectricoDAO dao = new ProelectricoDAO();
    Proelectrico p = new Proelectrico();
    InterfazGRafica vista = new InterfazGRafica();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(InterfazGRafica v) {
        this.vista = v;
        this.vista.btnlistar.addActionListener(this);
        this.vista.btnguardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnlistar) {
            listar(vista.Tabla);
        }
        if (e.getSource() == vista.btnguardar) {
            agregar();
        }
        /*if(e.getSource()==vista.btneditar){
            ifn fila=vista.Tabla.getSelectedRow();
            if(fila==-1){
                JOptionPane.showInputDialog(,"debe seleccionaar de la fila");
            }else{
                int id=Integer.parseInt((String)vista.Tabla.getValueAt(fila,0).toString());
                String nom=vista.Tabla.getValueAt(fila, 1);
            }
        }*/
    }
    
    public void actualizar(){
    
    }

    public void agregar() {
        try {
            String nombre = vista.txtnombre.getText();
            double precio = Double.parseDouble(vista.txtprecio.getText());
            String marca = vista.txtmarca.getText();
            String sisoperativo = vista.txtsisoperativo.getText();
            String material = vista.txtmaterial.getText();

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setMarca(marca);
            p.setSisoperativo(sisoperativo);
            p.setMaterial(material);

            int r = dao.agregar(p);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Producto agregado con éxito.");
                listar(vista.Tabla); // Actualiza la tabla después de agregar
            } else {
                JOptionPane.showMessageDialog(vista, "Error al agregar el producto.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Error en el formato de los datos: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error inesperado: " + ex.getMessage());
        }
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpia la tabla antes de listar
        List<Proelectrico> lista = dao.listar();
        Object[] object = new Object[6];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getPrecio();
            object[3] = lista.get(i).getMarca();
            object[4] = lista.get(i).getSisoperativo();
            object[5] = lista.get(i).getMaterial();
            modelo.addRow(object);
        }
        vista.Tabla.setModel(modelo);
    }
}
