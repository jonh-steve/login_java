package org.example.model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private int quantity;
    private Product(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public Product(){}


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameProduct;
    }

    public void setName(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return "id:"+id+",nameProduct:"+nameProduct+",price:"+price;
    }
}
