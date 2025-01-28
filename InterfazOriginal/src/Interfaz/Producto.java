package Interfaz;

import Interfaz.Lote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rapto
 */
abstract class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getMarca();

    public abstract String getSistemaOperativo();

    public abstract String getMaterial();

    public abstract void mostrar();

    public abstract void agregarLote(Lote lote);

    public abstract Lote[] getLotes();

    public abstract String getTalla();

    public abstract String getColor();

    public abstract String getTipo();

    public void guardarEnDB() throws SQLException {
        String sql = "INSERT INTO Producto (nombre, precio, tipo) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, this.nombre);
            pstmt.setDouble(2, this.precio);
            pstmt.setString(3, "NoPerecedero");  // Asumiendo que todos son NoPerecederos ahora
            pstmt.executeUpdate();

            // Obtener el ID generado
            try (var generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int idProducto = generatedKeys.getInt(1);
                    // Verificar si es una instancia de NoPerecedero y guardar
                    if (this instanceof NoPerecedero noPerecedero) {
                        noPerecedero.guardarNoPerecederoEnDB(idProducto);
                    }
                }
            }
        }
    }

}
