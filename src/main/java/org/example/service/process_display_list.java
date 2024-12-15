package org.example.service;

import org.example.model.Product;
import org.example.responsitory.Product_Repository;

import java.util.List;

public class process_display_list {
    private Product_Repository product_Repository = new Product_Repository();
    public List<Product> process(){
        System.out.println(product_Repository.selectAll());
        return product_Repository.selectAll();
    }
}
