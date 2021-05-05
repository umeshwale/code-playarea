package com.example.springbootswagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SwaggerRestController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts() {
        return Arrays.asList("product1", "product2", "product3");
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProducts() {
        return "New Product created";
    }
}
