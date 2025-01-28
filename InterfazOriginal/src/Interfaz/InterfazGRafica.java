package Interfaz;

import Interfaz.Inventario;
import Interfaz.Electronico;
import Interfaz.FechaVencimiento;
import Interfaz.Indumentaria;
import Interfaz.Lote;
import Interfaz.Perecedero;
import Interfaz.NoPerecedero;
import Interfaz.Producto;
import controlador.Controlador;
import java.awt.Font;
import java.awt.Label;
import java.awt.font.TextAttribute;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;

public final class InterfazGRafica extends javax.swing.JFrame {

    Inventario<Producto> inventario = new Inventario<>();

    Inventario<Producto> inventarioAli = new Inventario<>();
    Inventario<Producto> inventarioElec = new Inventario<>();
    Inventario<Producto> inventarioIndum = new Inventario<>();

    public InterfazGRafica() {
        initComponents(); 
        // Llamar al método para cargar los productos desde la base de datos
        contenedor.setEnabled(false);

        // Crear Productos perecederos
        Producto perecedero = new Perecedero("Leche", 5);
        Producto perecedero2 = new Perecedero("Huevos", 0.8);
        Producto perecedero3 = new Perecedero("Carne", 25);

        // Crear lote
        Lote l1 = new Lote("1586", 14, 25, 10, 10, 25);
        Lote l2 = new Lote("1652", 14, 25, 10, 10, 25);
        Lote l3 = new Lote("2545", 14, 25, 10, 10, 25);
        Lote l4 = new Lote("528", 14, 25, 20, 15, 16);
        Lote l5 = new Lote("156", 14, 25, 11, 5, 23);

        // Agregar lotes
        perecedero.agregarLote(l1);
        perecedero.agregarLote(l2);
        perecedero.agregarLote(l3);

        perecedero2.agregarLote(l4);
        perecedero2.agregarLote(l1);

        perecedero3.agregarLote(l1);

        // Crear productos de indumentaria
        Producto indumentaria = new Indumentaria("Camiseta", 19.99, "Nike", "M", "Azul", "Ropa");
        Producto indumentaria2 = new Indumentaria("CamisetaPremium", 25.99, "Nike", "M", "Azul", "Ropa");
        
        Producto electronico = new Electronico ("Laptop",5000,"HP","Windows","Metalico");
        Producto electronico2 = new Electronico ("Celular",1700,"Huawei","Android","Plastico");
        
        inventario.agregarProducto(electronico);
        inventario.agregarProducto(electronico2);
        

        // Agregar productos al inventario
        inventario.agregarProducto(perecedero);
        inventario.agregarProducto(perecedero2);
        inventario.agregarProducto(perecedero3);
        inventario.agregarProducto(indumentaria);
        inventario.agregarProducto(indumentaria2);
    }

    /*public void cargarProductosDesdeDB() {
        // Consulta SQL para obtener todos los productos (sin filtros)
        String sql = "SELECT p.idProducto, p.nombre, p.precio, p.tipo, n.marca, e.sistema_operativo, e.material "
                + "FROM Producto p "
                + "LEFT JOIN NoPerecedero n ON p.idProducto = n.idProducto "
                + "LEFT JOIN Electronico e ON n.idNoPerecedero = e.idNoPerecedero";

        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            // Limpiar la tabla actual
            DefaultTableModel model = (DefaultTableModel) tablaElectronicos.getModel();
            model.setRowCount(0); // Eliminar todas las filas existentes

            // Recorrer los resultados y agregarlos a la tabla
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String marca = rs.getString("marca");
                String sistemaOperativo = rs.getString("sistema_operativo");
                String material = rs.getString("material");

                // Agregar una fila a la tabla con los datos del producto
                model.addRow(new Object[]{nombre, precio, marca, sistemaOperativo, material});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los productos desde la base de datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JTabbedPane();
        menu = new javax.swing.JPanel();
        botonAgregarAlimentos = new javax.swing.JButton();
        botonBuscarPerecedero = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonSalida1 = new javax.swing.JButton();
        botonAgregarElectronicos = new javax.swing.JButton();
        botonAgregarIndumentaria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaElectronicos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaIndumentaria = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        comboBoxOrdenar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        botonMenu1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondoAgregarAlimentos = new javax.swing.JPanel();
        cajaNombreAlimentos = new javax.swing.JTextField();
        cajaPrecioAliemtos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cajaCodigoLote = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajaFechaVencimiento = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        botonMenu2 = new javax.swing.JButton();
        tablaMensajeAgregarAlimentos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondoAgregarElectronico = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtsisoperativo = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtmaterial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonMenu3 = new javax.swing.JButton();
        mensajeAgragarElectronico = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        fondoAgregarIndumentaria = new javax.swing.JPanel();
        cajaNombreIndumentaria = new javax.swing.JTextField();
        cajaPrecioIndumentaria = new javax.swing.JTextField();
        cajaMarcaIndumentaria = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cajaTalla = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cajonColor = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cajaTipo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonMenu5 = new javax.swing.JButton();
        mensajeAgregarIndumentario = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        fondoBuscar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cajaBuscarProducto = new javax.swing.JTextField();
        botonBuscarProducto = new javax.swing.JButton();
        botonMenu6 = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        fondoEliminar = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        nombreEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        boronEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cajaNombreModificar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cajaPrecioModificar = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        botonMenu4 = new javax.swing.JButton();
        modificarEliminar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fondoBuscar1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        cajaBuscarProducto1 = new javax.swing.JTextField();
        botonBuscarProducto1 = new javax.swing.JButton();
        botonMenu7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        mensajeBuscarPerecedero = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarAlimentos.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregarAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarAlimentos.setText("Agregar Producto Perecederos");
        botonAgregarAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAlimentosActionPerformed(evt);
            }
        });
        menu.add(botonAgregarAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 250, 45));

        botonBuscarPerecedero.setBackground(new java.awt.Color(0, 0, 0));
        botonBuscarPerecedero.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarPerecedero.setText("Buscar Producto Perecedero");
        botonBuscarPerecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPerecederoActionPerformed(evt);
            }
        });
        menu.add(botonBuscarPerecedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 250, 45));

        botonProductos.setBackground(new java.awt.Color(0, 0, 0));
        botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonProductos.setText("Productos");
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });
        menu.add(botonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 45));

        botonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar Producto NoPerecedero");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        menu.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 250, 45));

        botonSalida1.setBackground(new java.awt.Color(0, 0, 0));
        botonSalida1.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida1.setText("Eliminar y modificar precio");
        botonSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalida1ActionPerformed(evt);
            }
        });
        menu.add(botonSalida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 250, 45));

        botonAgregarElectronicos.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregarElectronicos.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarElectronicos.setText("Agregar Producto Electronico");
        botonAgregarElectronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarElectronicosActionPerformed(evt);
            }
        });
        menu.add(botonAgregarElectronicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 45));

        botonAgregarIndumentaria.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregarIndumentaria.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarIndumentaria.setText("Agregar Producto Indumentaria");
        botonAgregarIndumentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIndumentariaActionPerformed(evt);
            }
        });
        menu.add(botonAgregarIndumentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 250, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo1.jpg"))); // NOI18N
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 780, 500));

        contenedor.addTab("Menu", menu);

        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaElectronicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Marca", "Sistema Operativo", "Material"
            }
        ));
        jScrollPane1.setViewportView(tablaElectronicos);

        panelInventario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 370, 150));

        tablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Marca", "Talla", "Color", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(tablaIndumentaria);

        panelInventario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 390, 150));

        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Codigo de lote", "Fecha de vencimiento", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(tablaAlimentos);

        panelInventario.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 120, 510, 160));

        comboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar por cantidad de lotes", "Ordenar precio" }));
        comboBoxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrdenarActionPerformed(evt);
            }
        });
        panelInventario.add(comboBoxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Realizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelInventario.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 45));

        botonMenu1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu1.setText("MENU");
        botonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu1ActionPerformed(evt);
            }
        });
        panelInventario.add(botonMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 200, 40));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ALIMENTOS");
        panelInventario.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 150, 40));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("INDUMENTARIAS");
        panelInventario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 150, 40));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ELECTRONICOS");
        panelInventario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo2.jpg"))); // NOI18N
        panelInventario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Productos", panelInventario);

        fondoAgregarAlimentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaNombreAlimentos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaNombreAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreAlimentosActionPerformed(evt);
            }
        });
        fondoAgregarAlimentos.add(cajaNombreAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 240, 30));

        cajaPrecioAliemtos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaPrecioAliemtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioAliemtosActionPerformed(evt);
            }
        });
        fondoAgregarAlimentos.add(cajaPrecioAliemtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 240, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE");
        fondoAgregarAlimentos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 240, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRECIO");
        fondoAgregarAlimentos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CODIGO DE LOTE");
        fondoAgregarAlimentos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 30));

        cajaCodigoLote.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarAlimentos.add(cajaCodigoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 240, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FECHA DE VENCIMIENTO");
        fondoAgregarAlimentos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 240, 30));

        cajaFechaVencimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarAlimentos.add(cajaFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 240, 30));

        cajaCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarAlimentos.add(cajaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 240, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CANTIDAD");
        fondoAgregarAlimentos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 240, 30));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton2.setText("AÑADIR PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondoAgregarAlimentos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 240, 30));

        jLabel44.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("ALIMENTOS");
        fondoAgregarAlimentos.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 300, 50));

        botonMenu2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu2.setText("MENU");
        botonMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu2ActionPerformed(evt);
            }
        });
        fondoAgregarAlimentos.add(botonMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 200, 40));

        tablaMensajeAgregarAlimentos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tablaMensajeAgregarAlimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoAgregarAlimentos.add(tablaMensajeAgregarAlimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 500, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo3.jpg"))); // NOI18N
        fondoAgregarAlimentos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Agregar Alimentos", fondoAgregarAlimentos);

        fondoAgregarElectronico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 20));

        txtprecio.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, 20));

        txtmarca.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 20));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("NOMBRE");
        fondoAgregarElectronico.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 20));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("PRECIO");
        fondoAgregarElectronico.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 20));

        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("MARCA");
        fondoAgregarElectronico.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 20));

        jLabel38.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("SISTEMA OPERATIVO");
        fondoAgregarElectronico.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 150, 240, 30));

        txtsisoperativo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtsisoperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsisoperativoActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(txtsisoperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 20));

        jLabel39.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("MATERIAL");
        fondoAgregarElectronico.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

        txtmaterial.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarElectronico.add(txtmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ELECTRONICOS");
        fondoAgregarElectronico.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 30));

        botonMenu3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu3.setText("MENU");
        botonMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu3ActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(botonMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 200, 40));

        mensajeAgragarElectronico.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        mensajeAgragarElectronico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoAgregarElectronico.add(mensajeAgragarElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 500, 40));

        jLabel27.setText("ID");
        fondoAgregarElectronico.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        txtid.setEditable(false);
        fondoAgregarElectronico.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 180, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });
        fondoAgregarElectronico.add(btnlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel35.setText("Detalle");
        fondoAgregarElectronico.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "MARCA", "SIS-OPER", "MATERIAL"
            }
        ));
        jScrollPane5.setViewportView(Tabla);

        fondoAgregarElectronico.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 520, 260));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo3.jpg"))); // NOI18N
        fondoAgregarElectronico.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        jButton9.setText("jButton9");
        fondoAgregarElectronico.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        contenedor.addTab("Agregar Electronicos", fondoAgregarElectronico);

        fondoAgregarIndumentaria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaNombreIndumentaria.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaNombreIndumentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreIndumentariaActionPerformed(evt);
            }
        });
        fondoAgregarIndumentaria.add(cajaNombreIndumentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 30));

        cajaPrecioIndumentaria.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaPrecioIndumentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioIndumentariaActionPerformed(evt);
            }
        });
        fondoAgregarIndumentaria.add(cajaPrecioIndumentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 240, 30));

        cajaMarcaIndumentaria.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaMarcaIndumentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaMarcaIndumentariaActionPerformed(evt);
            }
        });
        fondoAgregarIndumentaria.add(cajaMarcaIndumentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 240, 30));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("NOMBRE");
        fondoAgregarIndumentaria.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 240, 30));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("PRECIO");
        fondoAgregarIndumentaria.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 240, 30));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("MARCA");
        fondoAgregarIndumentaria.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 30));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("TALLA");
        fondoAgregarIndumentaria.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 30));

        cajaTalla.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarIndumentaria.add(cajaTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 240, 30));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("COLOR");
        fondoAgregarIndumentaria.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 240, 30));

        cajonColor.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarIndumentaria.add(cajonColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 240, 30));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("TIPO");
        fondoAgregarIndumentaria.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 240, 30));

        cajaTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoAgregarIndumentaria.add(cajaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 240, 30));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton3.setText("AÑADIR PRODUCTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fondoAgregarIndumentaria.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 240, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INDUMENTARIA");
        fondoAgregarIndumentaria.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 470, 50));

        botonMenu5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu5.setText("MENU");
        botonMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu5ActionPerformed(evt);
            }
        });
        fondoAgregarIndumentaria.add(botonMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 200, 40));

        mensajeAgregarIndumentario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        mensajeAgregarIndumentario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoAgregarIndumentaria.add(mensajeAgregarIndumentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 500, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo3.jpg"))); // NOI18N
        fondoAgregarIndumentaria.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Agregar Indumentaria", fondoAgregarIndumentaria);

        fondoBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NOMBRE DEL PRODUCTO");
        fondoBuscar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 30));

        cajaBuscarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaBuscarProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarProductoActionPerformed(evt);
            }
        });
        fondoBuscar.add(cajaBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 250, 50));

        botonBuscarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        botonBuscarProducto.setText("BUSCAR");
        botonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProductoActionPerformed(evt);
            }
        });
        fondoBuscar.add(botonBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 240, 50));

        botonMenu6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu6.setText("MENU");
        botonMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu6ActionPerformed(evt);
            }
        });
        fondoBuscar.add(botonMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 200, 40));
        fondoBuscar.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 320, 200));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo4.jpg"))); // NOI18N
        fondoBuscar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Buscar Producto NoPerecedero", fondoBuscar);

        fondoEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nombre");
        fondoEliminar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, 40));

        nombreEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nombreEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEliminarActionPerformed(evt);
            }
        });
        fondoEliminar.add(nombreEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 240, 40));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ELIMINAR PRODUCTO");
        fondoEliminar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 500, 50));

        boronEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        boronEliminar.setText("ELIMINAR");
        boronEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boronEliminarActionPerformed(evt);
            }
        });
        fondoEliminar.add(boronEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 240, 40));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MODIFICAR");
        fondoEliminar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 500, 50));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre");
        fondoEliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, 40));

        cajaNombreModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fondoEliminar.add(cajaNombreModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 240, 40));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nuevo precio");
        fondoEliminar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 240, 40));

        cajaPrecioModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaPrecioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioModificarActionPerformed(evt);
            }
        });
        fondoEliminar.add(cajaPrecioModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 240, 40));

        botonModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        fondoEliminar.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 240, 40));

        botonMenu4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu4.setText("MENU");
        botonMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu4ActionPerformed(evt);
            }
        });
        fondoEliminar.add(botonMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 200, 40));

        modificarEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        modificarEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoEliminar.add(modificarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 400, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondoEliminar.jpg"))); // NOI18N
        fondoEliminar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Eliminar/Modificar Precio Productos", fondoEliminar);

        fondoBuscar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("NOMBRE DEL PRODUCTO");
        fondoBuscar1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 30));

        cajaBuscarProducto1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cajaBuscarProducto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaBuscarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarProducto1ActionPerformed(evt);
            }
        });
        fondoBuscar1.add(cajaBuscarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 250, 50));

        botonBuscarProducto1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        botonBuscarProducto1.setText("BUSCAR");
        botonBuscarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProducto1ActionPerformed(evt);
            }
        });
        fondoBuscar1.add(botonBuscarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 240, 50));

        botonMenu7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonMenu7.setText("MENU");
        botonMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenu7ActionPerformed(evt);
            }
        });
        fondoBuscar1.add(botonMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 200, 40));

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaMostrar);

        fondoBuscar1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 170));

        mensajeBuscarPerecedero.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        mensajeBuscarPerecedero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoBuscar1.add(mensajeBuscarPerecedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 500, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/fondo4.jpg"))); // NOI18N
        fondoBuscar1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        contenedor.addTab("Buscar Producto Perecedero", fondoBuscar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAlimentosActionPerformed
        contenedor.setSelectedComponent(fondoAgregarAlimentos);
        tablaMensajeAgregarAlimentos.setText("");
        cajaCodigoLote.setText("");
        cajaPrecioAliemtos.setText("");
        cajaNombreAlimentos.setText("");
        cajaFechaVencimiento.setText("");
        cajaCantidad.setText("");
    }//GEN-LAST:event_botonAgregarAlimentosActionPerformed

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        contenedor.setSelectedComponent(panelInventario);
        inventarioElec.limpiarInventario();
        inventarioIndum.limpiarInventario();
        inventarioAli.limpiarInventario();

        int cont = 0;
        while (inventario.getProductos()[cont] != null) {
            if (inventario.getProductos()[cont] instanceof Perecedero) {
                inventarioAli.agregarProducto(inventario.getProductos()[cont]);
            } else if (inventario.getProductos()[cont] instanceof Electronico) {
                inventarioElec.agregarProducto(inventario.getProductos()[cont]);
            } else {
                inventarioIndum.agregarProducto(inventario.getProductos()[cont]);
            }
            cont++;
        }

        //Inventario de electronicos
        String matElec[][] = new String[50][5];
        int contador = 0;
        while (inventarioElec.getProductos()[contador] != null) {
            matElec[contador][0] = inventarioElec.getProductos()[contador].getNombre();
            matElec[contador][1] = String.valueOf(inventarioElec.getProductos()[contador].getPrecio());
            matElec[contador][2] = inventarioElec.getProductos()[contador].getMarca();
            matElec[contador][3] = inventarioElec.getProductos()[contador].getSistemaOperativo();
            matElec[contador][4] = inventarioElec.getProductos()[contador].getMaterial();
            contador++;
        }

        tablaElectronicos.setModel(new javax.swing.table.DefaultTableModel(
                matElec,
                new String[]{
                    "Nombre", "Precio", "marca", "Sistema O.", "Material"
                }
        ));
       

        //inventario Indumentaria
        String matIndum[][] = new String[50][6];
        int contador1 = 0;
        while (inventarioIndum.getProductos()[contador1] != null) {
            matIndum[contador1][0] = inventarioIndum.getProductos()[contador1].getNombre();
            matIndum[contador1][1] = String.valueOf(inventarioIndum.getProductos()[contador1].getPrecio());
            matIndum[contador1][2] = inventarioIndum.getProductos()[contador1].getMarca();
            matIndum[contador1][3] = inventarioIndum.getProductos()[contador1].getTalla();
            matIndum[contador1][4] = inventarioIndum.getProductos()[contador1].getColor();
            matIndum[contador1][5] = inventarioIndum.getProductos()[contador1].getTipo();
            contador1++;
        }

        tablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
                matIndum,
                new String[]{
                    "Nombre", "Precio", "Marca", "Talla", "Color", "Tipo"
                }
        ));

        //Inventario de alimentos
        String mat[][] = new String[50][5];
        int fila = 0;
        int fila3 = 0;
        while (inventarioAli.getProductos()[fila] != null) {
            mat[fila3][0] = inventarioAli.getProductos()[fila].getNombre();
            mat[fila3][1] = String.valueOf(inventarioAli.getProductos()[fila].getPrecio());
            int fila2 = 0;
            while (inventarioAli.getProductos()[fila].getLotes()[fila2] != null) {
                mat[fila3][2] = inventarioAli.getProductos()[fila].getLotes()[fila2].getNroLote();
                mat[fila3][3] = inventarioAli.getProductos()[fila].getLotes()[fila2].getFechaVencimiento().getFecha();
                mat[fila3][4] = Integer.toString(inventarioAli.getProductos()[fila].getLotes()[fila2].getCantidad());
                fila2++;
                fila3++;
            }
            fila++;

        }
        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "Nombre", "Precio", "Codigo de lote", "fechaVencimiento", "Cantidad"
                }
        ));
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        contenedor.setSelectedComponent(fondoBuscar);
        cajaBuscarProducto.setText("");
        panelBuscar.removeAll();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void comboBoxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrdenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxOrdenarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inventarioElec.limpiarInventario();
        inventarioIndum.limpiarInventario();
        inventarioAli.limpiarInventario();

        if (comboBoxOrdenar.getSelectedItem().toString().equals("Ordenar por cantidad de lotes")) {

            int cont = 0;
            while (inventario.getProductos()[cont] != null) {
                if (inventario.getProductos()[cont] instanceof Perecedero) {
                    inventarioAli.agregarProducto(inventario.getProductos()[cont]);
                } else if (inventario.getProductos()[cont] instanceof Electronico) {
                    inventarioElec.agregarProducto(inventario.getProductos()[cont]);
                } else {
                    inventarioIndum.agregarProducto(inventario.getProductos()[cont]);
                }
                cont++;
            }

            //Inventario de electronicos
            String matElec[][] = new String[50][5];
            int contador = 0;
            while (inventarioElec.getProductos()[contador] != null) {
                matElec[contador][0] = inventarioElec.getProductos()[contador].getNombre();
                matElec[contador][1] = String.valueOf(inventarioElec.getProductos()[contador].getPrecio());
                matElec[contador][2] = inventarioElec.getProductos()[contador].getMarca();
                matElec[contador][3] = inventarioElec.getProductos()[contador].getSistemaOperativo();
                matElec[contador][4] = inventarioElec.getProductos()[contador].getMaterial();
                contador++;
            }

            tablaElectronicos.setModel(new javax.swing.table.DefaultTableModel(
                    matElec,
                    new String[]{
                        "Nombre", "Precio", "marca", "Sistema O.", "Material"
                    }
            ));

            //inventario Indumentaria
            String matIndum[][] = new String[50][6];
            int contador1 = 0;
            while (inventarioIndum.getProductos()[contador1] != null) {
                matIndum[contador1][0] = inventarioIndum.getProductos()[contador1].getNombre();
                matIndum[contador1][1] = String.valueOf(inventarioIndum.getProductos()[contador1].getPrecio());
                matIndum[contador1][2] = inventarioIndum.getProductos()[contador1].getMarca();
                matIndum[contador1][3] = inventarioIndum.getProductos()[contador1].getTalla();
                matIndum[contador1][4] = inventarioIndum.getProductos()[contador1].getColor();
                matIndum[contador1][5] = inventarioIndum.getProductos()[contador1].getTipo();
                contador1++;
            }

            tablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
                    matIndum,
                    new String[]{
                        "Nombre", "Precio", "Marca", "Talla", "Color", "Tipo"
                    }
            ));

            //Inventario de alimentos
            inventarioAli.ordenarCantidadLotes();
            String mat[][] = new String[50][5];
            int fila = 0;
            int fila3 = 0;
            while (inventarioAli.getProductos()[fila] != null) {
                mat[fila3][0] = inventarioAli.getProductos()[fila].getNombre();
                mat[fila3][1] = String.valueOf(inventarioAli.getProductos()[fila].getPrecio());
                int fila2 = 0;
                while (inventarioAli.getProductos()[fila].getLotes()[fila2] != null) {
                    mat[fila3][2] = inventarioAli.getProductos()[fila].getLotes()[fila2].getNroLote();
                    mat[fila3][3] = inventarioAli.getProductos()[fila].getLotes()[fila2].getFechaVencimiento().getFecha();
                    mat[fila3][4] = Integer.toString(inventarioAli.getProductos()[fila].getLotes()[fila2].getCantidad());
                    fila2++;
                    fila3++;
                }
                fila++;

            }
            tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
                    mat,
                    new String[]{
                        "Nombre", "Precio", "Codigo de lote", "fechaVencimiento", "Cantidad"
                    }
            ));
        } else {

            int cont = 0;
            while (inventario.getProductos()[cont] != null) {
                if (inventario.getProductos()[cont] instanceof Perecedero) {
                    inventarioAli.agregarProducto(inventario.getProductos()[cont]);
                } else if (inventario.getProductos()[cont] instanceof Electronico) {
                    inventarioElec.agregarProducto(inventario.getProductos()[cont]);
                } else {
                    inventarioIndum.agregarProducto(inventario.getProductos()[cont]);
                }
                cont++;
            }

            //Tabla Alimentos
            inventarioAli.ordenarPorPrecio();
            String mat[][] = new String[50][5];
            int fila = 0;
            int fila3 = 0;
            while (inventarioAli.getProductos()[fila] != null) {
                mat[fila3][0] = inventarioAli.getProductos()[fila].getNombre();
                mat[fila3][1] = String.valueOf(inventarioAli.getProductos()[fila].getPrecio());
                int fila2 = 0;
                while (inventarioAli.getProductos()[fila].getLotes()[fila2] != null) {
                    mat[fila3][2] = inventarioAli.getProductos()[fila].getLotes()[fila2].getNroLote();
                    mat[fila3][3] = inventarioAli.getProductos()[fila].getLotes()[fila2].getFechaVencimiento().getFecha();
                    mat[fila3][4] = Integer.toString(inventarioAli.getProductos()[fila].getLotes()[fila2].getCantidad());
                    fila2++;
                    fila3++;
                }
                fila++;

            }
            tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
                    mat,
                    new String[]{
                        "Nombre", "Precio", "Codigo de lote", "fechaVencimiento", "Cantidad"
                    }
            ));

            //Inventario de electronicos
            inventarioElec.ordenarPorPrecio();
            String matElec[][] = new String[50][5];
            int contador = 0;
            while (inventarioElec.getProductos()[contador] != null) {
                matElec[contador][0] = inventarioElec.getProductos()[contador].getNombre();
                matElec[contador][1] = String.valueOf(inventarioElec.getProductos()[contador].getPrecio());
                matElec[contador][2] = inventarioElec.getProductos()[contador].getMarca();
                matElec[contador][3] = inventarioElec.getProductos()[contador].getSistemaOperativo();
                matElec[contador][4] = inventarioElec.getProductos()[contador].getMaterial();
                contador++;
            }

            tablaElectronicos.setModel(new javax.swing.table.DefaultTableModel(
                    matElec,
                    new String[]{
                        "Nombre", "Precio", "marca", "Sistema O.", "Material"
                    }
            ));

            //inventario Indumentaria
            inventarioIndum.ordenarPorPrecio();
            String matIndum[][] = new String[50][6];
            int contador1 = 0;
            while (inventarioIndum.getProductos()[contador1] != null) {
                matIndum[contador1][0] = inventarioIndum.getProductos()[contador1].getNombre();
                matIndum[contador1][1] = String.valueOf(inventarioIndum.getProductos()[contador1].getPrecio());
                matIndum[contador1][2] = inventarioIndum.getProductos()[contador1].getMarca();
                matIndum[contador1][3] = inventarioIndum.getProductos()[contador1].getTalla();
                matIndum[contador1][4] = inventarioIndum.getProductos()[contador1].getColor();
                matIndum[contador1][5] = inventarioIndum.getProductos()[contador1].getTipo();
                contador1++;
            }

            tablaIndumentaria.setModel(new javax.swing.table.DefaultTableModel(
                    matIndum,
                    new String[]{
                        "Nombre", "Precio", "Marca", "Talla", "Color", "Tipo"
                    }
            ));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cajaNombreAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreAlimentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreAlimentosActionPerformed

    private void cajaPrecioAliemtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioAliemtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioAliemtosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String nombreAlimento = cajaNombreAlimentos.getText();
        double precioAlimento = Double.parseDouble(cajaPrecioAliemtos.getText());
        String codigoLote = cajaCodigoLote.getText();
        String fechaVencimiento = cajaFechaVencimiento.getText();
        int dia = Integer.parseInt(fechaVencimiento.substring(0, 2));
        int mes = Integer.parseInt(fechaVencimiento.substring(3, 5));
        int año = Integer.parseInt(fechaVencimiento.substring(6, 8));
        int cantidad = Integer.parseInt(cajaCantidad.getText());

        double precioLote = cantidad * precioAlimento;
        Lote lote = new Lote(codigoLote, cantidad, precioLote, dia, mes, año);
        Producto nuevo = new Perecedero(nombreAlimento, precioAlimento);
        tablaMensajeAgregarAlimentos.setText("Alimento agregado con exito");

        cajaCodigoLote.setText("");
        cajaPrecioAliemtos.setText("");
        cajaNombreAlimentos.setText("");
        cajaFechaVencimiento.setText("");
        cajaCantidad.setText("");

        int contador = 0;
        boolean a = true;
        while (inventario.getProductos()[contador] != null) {
            if (inventario.getProductos()[contador].getNombre().equalsIgnoreCase(nombreAlimento)) {
                inventario.getProductos()[contador].agregarLote(lote);
                a = false;
            }
            contador++;
        }
        if (a) {
            nuevo.agregarLote(lote);
            inventario.agregarProducto(nuevo);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cajaBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarProductoActionPerformed

    private void botonSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalida1ActionPerformed
        contenedor.setSelectedComponent(fondoEliminar);
        modificarEliminar.setText("");
    }//GEN-LAST:event_botonSalida1ActionPerformed

    private void botonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProductoActionPerformed
        contenedor.setSelectedComponent(fondoBuscar);

        panelBuscar.removeAll();
        panelBuscar.revalidate();

        Producto nuevo = inventario.buscarProducto(cajaBuscarProducto.getText());
        if (nuevo instanceof Electronico) {
            JLabel lb = new JLabel("<html>Nombre: " + nuevo.getNombre() + "<br>Precio: " + nuevo.getMarca() + "<br>Sistema Operativo: " + nuevo.getSistemaOperativo() + "<br>Material: " + nuevo.getMaterial() + "</html>");
            String precio = String.valueOf(nuevo.getPrecio());
            lb.setFont(new Font("Arial", Font.BOLD, 15));
            panelBuscar.add(lb);
        } else if (nuevo instanceof Indumentaria) {
            JLabel lb = new JLabel("<html>Nombre: " + nuevo.getNombre() + "<br>Precio: " + nuevo.getPrecio() + "<br>Marca: " + nuevo.getMarca() + "<br>Talla: " + nuevo.getTalla() + "<br>Color: " + nuevo.getColor() + "<br>Tipo: " + nuevo.getTipo() + "</html>");
            String precio = String.valueOf(nuevo.getPrecio());
            lb.setFont(new Font("Arial", Font.BOLD, 15));
            panelBuscar.add(lb);
        } else {
            JLabel lb1 = new JLabel("NO SE ENCONTRO EL PRODUCTO");
            panelBuscar.add(lb1);
        }
        cajaBuscarProducto.setText("");
    }//GEN-LAST:event_botonBuscarProductoActionPerformed

    private void cajaNombreIndumentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreIndumentariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreIndumentariaActionPerformed

    private void cajaPrecioIndumentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioIndumentariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioIndumentariaActionPerformed

    private void cajaMarcaIndumentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaMarcaIndumentariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaMarcaIndumentariaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = cajaNombreIndumentaria.getText();
        double precio = Double.parseDouble(cajaPrecioIndumentaria.getText());
        String marca = cajaMarcaIndumentaria.getText();
        String talla = cajaTalla.getText();
        String color = cajonColor.getText();
        String tipo = cajaTipo.getText();
        Producto nuevo = new Indumentaria(nombre, precio, marca, talla, color, tipo);
        inventario.agregarProducto(nuevo);
        mensajeAgregarIndumentario.setText("Producto agregado con exito");

        cajaNombreIndumentaria.setText("");
        cajaPrecioIndumentaria.setText("");
        cajaMarcaIndumentaria.setText("");
        cajaTalla.setText("");
        cajonColor.setText("");
        cajaTipo.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void txtsisoperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsisoperativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsisoperativoActionPerformed

    private void nombreEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEliminarActionPerformed

    private void botonAgregarElectronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarElectronicosActionPerformed
        contenedor.setSelectedComponent(fondoAgregarElectronico);
        mensajeAgragarElectronico.setText("");
        txtnombre.setText("");
        txtprecio.setText("");
        txtmarca.setText("");
        txtsisoperativo.setText("");
        txtmaterial.setText("");
    }//GEN-LAST:event_botonAgregarElectronicosActionPerformed

    private void botonAgregarIndumentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIndumentariaActionPerformed
        contenedor.setSelectedComponent(fondoAgregarIndumentaria);
        cajaTipo.setText("");
    }//GEN-LAST:event_botonAgregarIndumentariaActionPerformed

    private void cajaPrecioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioModificarActionPerformed

    private void botonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu1ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu1ActionPerformed

    private void botonMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu2ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu2ActionPerformed

    private void botonMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu3ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu3ActionPerformed

    private void botonMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu4ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu4ActionPerformed

    private void botonMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu5ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu5ActionPerformed

    private void botonMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu6ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu6ActionPerformed

    private void cajaBuscarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarProducto1ActionPerformed

    private void botonBuscarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProducto1ActionPerformed
        mensajeBuscarPerecedero.setText("");
        Producto nuevo = inventario.buscarProducto(cajaBuscarProducto1.getText());
        if (nuevo == null) {
            mensajeBuscarPerecedero.setText("No se encontro el Producto");
        }
        Inventario aux = new Inventario();
        aux.agregarProducto(nuevo);
        String mat[][] = new String[50][5];
        int fila = 0;
        int fila3 = 0;
        while (aux.getProductos()[fila] != null) {
            mat[fila3][0] = aux.getProductos()[fila].getNombre();
            mat[fila3][1] = String.valueOf(aux.getProductos()[fila].getPrecio());
            int fila2 = 0;
            while (aux.getProductos()[fila].getLotes()[fila2] != null) {
                mat[fila3][2] = aux.getProductos()[fila].getLotes()[fila2].getNroLote();
                mat[fila3][3] = aux.getProductos()[fila].getLotes()[fila2].getFechaVencimiento().getFecha();
                mat[fila3][4] = Integer.toString(aux.getProductos()[fila].getLotes()[fila2].getCantidad());
                fila2++;
                fila3++;
            }
            fila++;

        }
        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "Nombre", "Precio", "Codigo de lote", "fechaVencimiento", "Cantidad"
                }
        ));

        cajaBuscarProducto1.setText("");
    }//GEN-LAST:event_botonBuscarProducto1ActionPerformed

    private void botonMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenu7ActionPerformed
        contenedor.setSelectedComponent(menu);
    }//GEN-LAST:event_botonMenu7ActionPerformed

    private void botonBuscarPerecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPerecederoActionPerformed
        contenedor.setSelectedComponent(fondoBuscar1);
        mensajeBuscarPerecedero.setText("");
    }//GEN-LAST:event_botonBuscarPerecederoActionPerformed

    private void boronEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boronEliminarActionPerformed
        if (inventario.eliminarProducto(nombreEliminar.getText())) {
            modificarEliminar.setText("Producto Eliminado");
        } else {
            modificarEliminar.setText("Producto no encontrado");
        }
        nombreEliminar.setText("");
    }//GEN-LAST:event_boronEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        double precioAux = Double.parseDouble(cajaPrecioModificar.getText());

        if (inventario.actualizarPrecio(cajaNombreModificar.getText(), precioAux)) {
            modificarEliminar.setText("Producto modificado con exito");
        } else {
            modificarEliminar.setText("Producto no encontrado");
        }
        cajaNombreModificar.setText("");
        cajaPrecioModificar.setText("");

    }//GEN-LAST:event_botonModificarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String nombre = txtnombre.getText();
        double precio = Double.parseDouble(txtprecio.getText());
        String marca = txtmarca.getText();
        String SI = txtsisoperativo.getText();
        String material = txtmaterial.getText();
        Producto nuevo = new Electronico(nombre,precio,marca,SI,material);
        inventario.agregarProducto(nuevo);
        txtnombre.setText("");
        txtprecio.setText("");
        txtmarca.setText("");
        txtsisoperativo.setText("");
        txtmaterial.setText("");
        
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnlistarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        InterfazGRafica v=new InterfazGRafica();
        Controlador c=new Controlador(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGRafica().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla;
    private javax.swing.JButton boronEliminar;
    private javax.swing.JButton botonAgregarAlimentos;
    private javax.swing.JButton botonAgregarElectronicos;
    private javax.swing.JButton botonAgregarIndumentaria;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscarPerecedero;
    private javax.swing.JButton botonBuscarProducto;
    private javax.swing.JButton botonBuscarProducto1;
    private javax.swing.JButton botonMenu1;
    private javax.swing.JButton botonMenu2;
    private javax.swing.JButton botonMenu3;
    private javax.swing.JButton botonMenu4;
    private javax.swing.JButton botonMenu5;
    private javax.swing.JButton botonMenu6;
    private javax.swing.JButton botonMenu7;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonSalida1;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnlistar;
    private javax.swing.JTextField cajaBuscarProducto;
    private javax.swing.JTextField cajaBuscarProducto1;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaCodigoLote;
    private javax.swing.JTextField cajaFechaVencimiento;
    private javax.swing.JTextField cajaMarcaIndumentaria;
    private javax.swing.JTextField cajaNombreAlimentos;
    private javax.swing.JTextField cajaNombreIndumentaria;
    private javax.swing.JTextField cajaNombreModificar;
    private javax.swing.JTextField cajaPrecioAliemtos;
    private javax.swing.JTextField cajaPrecioIndumentaria;
    private javax.swing.JTextField cajaPrecioModificar;
    private javax.swing.JTextField cajaTalla;
    private javax.swing.JTextField cajaTipo;
    private javax.swing.JTextField cajonColor;
    private javax.swing.JComboBox<String> comboBoxOrdenar;
    private javax.swing.JTabbedPane contenedor;
    private javax.swing.JPanel fondoAgregarAlimentos;
    private javax.swing.JPanel fondoAgregarElectronico;
    private javax.swing.JPanel fondoAgregarIndumentaria;
    private javax.swing.JPanel fondoBuscar;
    private javax.swing.JPanel fondoBuscar1;
    private javax.swing.JPanel fondoEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel mensajeAgragarElectronico;
    private javax.swing.JLabel mensajeAgregarIndumentario;
    private javax.swing.JLabel mensajeBuscarPerecedero;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel modificarEliminar;
    private javax.swing.JTextField nombreEliminar;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JTable tablaAlimentos;
    private javax.swing.JTable tablaElectronicos;
    private javax.swing.JTable tablaIndumentaria;
    private javax.swing.JLabel tablaMensajeAgregarAlimentos;
    private javax.swing.JTable tablaMostrar;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtmarca;
    public javax.swing.JTextField txtmaterial;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtprecio;
    public javax.swing.JTextField txtsisoperativo;
    // End of variables declaration//GEN-END:variables
}
