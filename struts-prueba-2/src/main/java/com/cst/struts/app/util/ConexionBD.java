package com.cst.struts.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/usuarios_bd?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "toor";
    private static Connection connection;

    // Método estático para obtener la instancia de la conexión
    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            synchronized (ConexionBD.class) {
                if (connection == null) {
                    try {
                        // Registra el driver JDBC
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // Establece la conexión
                        connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                    } catch (ClassNotFoundException e) {
                        System.out.println("Driver JDBC no encontrado.");
                        e.printStackTrace(); // Asegúrate de manejar esto adecuadamente
                        throw new SQLException("Driver JDBC no encontrado.", e);
                    } catch (SQLException e) {
                        System.out.println("Error al establecer la conexión con la base de datos.");
                        e.printStackTrace(); // Asegúrate de manejar esto adecuadamente
                        throw e;
                    }
                }
            }
        }
        return connection;
    }
}
