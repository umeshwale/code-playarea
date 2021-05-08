package com.example.springbootconcepts.controller;

import com.example.springbootconcepts.beans.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restcontroller")
public class SpringRestController {

    @GetMapping(value = "/products")
    public Product getProducts() {
        System.out.println("In restcontroller products");
        Product product = new Product("Rest Controller Product");
        return product;
    }

}
