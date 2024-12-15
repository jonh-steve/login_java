package org.example.config;

import java.sql.Connection;

public class MysqlConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "03052004";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static Connection getConnection(){
        Connection connection = null;
        try {
            System.out.println("khoi tao ket noi ");
            Class.forName(DRIVER);
            connection = java.sql.DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (Exception e) {
            System.out.println("ket noi that bai o myconnextion");
            e.printStackTrace();
        } finally {
            System.out.println("ket noi thanh cong o myconnextion");
        }
        return connection;
    }
}
