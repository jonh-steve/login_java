package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Product;
import org.example.responsitory.Product_Repository;

import java.io.IOException;
import java.util.List;

@WebServlet("/display_list_product")
public class Display_list_product extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product_Repository product_Repository = new Product_Repository();
        List<Product> listProduct = product_Repository.selectAll();
        System.out.println(listProduct+ "controller hienthi");
        if (listProduct.isEmpty()) {
            resp.sendRedirect("add_product");
            System.out.println("controller2");
        }else {
            req.setAttribute("listProduct", product_Repository.selectAll());
            req.getRequestDispatcher("view/Display_list_product.jsp").forward(req, resp);
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
//            System.out.println("controller1" + listProduct);
        }

    }
}

