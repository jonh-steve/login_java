package org.example.responsitory;

import org.example.config.MysqlConnection;
import org.example.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Product_Repository {
    //    public static MysqlConnection mysqlConnection = new MysqlConnection();
    public List<Product> selectAll() {
        System.out.println("ressponsitory");
        List<Product> Product = new ArrayList<>();
        String query = "select * from product ";
//        Connection connection = MysqlConecttion.getConnection();
        try (Connection connection = MysqlConnection.getConnection()) {
            if (connection == null) {
                throw new RuntimeException("Cannot establish connection to database");
            }
            PreparedStatement preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setString(1,username);
//        preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                try {
                    Product product = new Product();
                    product.setId(resultSet.getInt("id"));
//                    System.out.println(resultSet.getInt("id"));
                    product.setName(resultSet.getString("nameProduct"));
//                    System.out.println(resultSet.getString("nameProduct"));
                    product.setQuantity(resultSet.getInt("quantity"));
//                    System.out.println(resultSet.getInt("quantity"));
                    product.setPrice(resultSet.getDouble("price"));
//                    System.out.println(resultSet.getDouble("price"));
//                .setPassword(resultSet.getString("password"));
                    Product.add(product);
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error while fetching product /n loij nay khong the nap san pham", e);
        }
        System.out.println(Product);
        return Product;
    }

}
