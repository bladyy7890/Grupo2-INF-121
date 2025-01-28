/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/dbfinal"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 
    
    private static Connection connection = null;

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                // Cargar el driver de MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (ClassNotFoundException | SQLException e) {
                throw new SQLException("Error al conectar a la base de datos", e.getMessage());
            }
        }
        return connection;
    }

    // Método para cerrar la conexión
    /*public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }*/
}