package com.example.springbootconcepts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/restcontroller")
public class SpringRestController {

    @GetMapping(value = "/products")
    public Product getProducts() {
        Product product = new Product("Rest Controller Product");
        return product;
    }

}
