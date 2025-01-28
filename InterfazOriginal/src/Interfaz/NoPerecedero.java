package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class NoPerecedero extends Producto {
    String marca;

    public NoPerecedero(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
    }

    @Override
    public void agregarLote(Lote lote) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSistemaOperativo() {
        return null; // No aplica para NoPerecedero
    }

    @Override
    public String getMaterial() {
        return null; // No aplica para NoPerecedero
    }

    @Override
    public Lote[] getLotes() {
        return null; // Implementar si es necesario
    }

    @Override
    public String getTalla() {
        return null; // No aplica para NoPerecedero
    }

    @Override
    public String getColor() {
        return null; // No aplica para NoPerecedero
    }

    @Override
    public String getTipo() {
        return "NoPerecedero";
    }

    public void guardarNoPerecederoEnDB(int idProducto) throws SQLException {
        String sql = "INSERT INTO NoPerecedero (idProducto, marca) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            // Validar que 'marca' no sea nula
            if (this.marca == null || this.marca.isEmpty()) {
                throw new SQLException("La marca del producto NoPerecedero no puede estar vacía.");
            }

            pstmt.setInt(1, idProducto);
            pstmt.setString(2, this.marca);
            pstmt.executeUpdate();

            // Obtener el ID generado para el NoPerecedero
            try (var generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int idNoPerecedero = generatedKeys.getInt(1); // ID del NoPerecedero insertado
                    // Si es un Electronico, insertar en la tabla Electronico
                    if (this instanceof Electronico) {
                        ((Electronico) this).guardarElectronicoEnDB(idNoPerecedero);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar NoPerecedero: " + e.getMessage());
            throw e; // Lanza la excepción para que el código llamador pueda manejarla
        }
    }
}
