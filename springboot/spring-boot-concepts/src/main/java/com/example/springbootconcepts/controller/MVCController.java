package com.example.springbootconcepts.controller;

import com.example.springbootconcepts.beans.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/mvccontroller")
public class MVCController {

    @GetMapping(value = "/products")
    public @ResponseBody
    Product getProducts() {
        Product product = new Product("MVC Controller Product");
        return product;
    }

}
