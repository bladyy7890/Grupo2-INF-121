package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Electronico extends NoPerecedero {

    private String sistemaOperativo;
    private String material;

    public Electronico(String nombre, double precio, String marca, String sistemaOperativo, String material) {
        super(nombre, precio, marca);
        this.sistemaOperativo = sistemaOperativo;
        this.material = material;
    }

    @Override
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("Material: " + material);
    }

    public void guardarElectronicoEnDB(int idNoPerecedero) throws SQLException {
        String sql = "INSERT INTO Electronico (idNoPerecedero, sistema_operativo, material) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Validar que los atributos no sean nulos o vacíos
            if (this.sistemaOperativo == null || this.sistemaOperativo.isEmpty()) {
                throw new SQLException("El sistema operativo no puede ser nulo o vacío.");
            }
            if (this.material == null || this.material.isEmpty()) {
                throw new SQLException("El material no puede ser nulo o vacío.");
            }

            pstmt.setInt(1, idNoPerecedero);
            pstmt.setString(2, this.sistemaOperativo);
            pstmt.setString(3, this.material);

            // Ejecutar la inserción
            pstmt.executeUpdate();
            System.out.println("Producto electrónico insertado exitosamente.");
        } catch (SQLException e) {
            // Manejo de excepciones más detallado
            System.err.println("Error al insertar Electronico: " + e.getMessage());
            throw e; // Relanzar la excepción para que se maneje a nivel superior si es necesario
        }
    }
}
