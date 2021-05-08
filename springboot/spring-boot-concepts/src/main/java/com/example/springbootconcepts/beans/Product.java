package com.example.springbootconcepts.beans;

public class Product {
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    String productName;
}
