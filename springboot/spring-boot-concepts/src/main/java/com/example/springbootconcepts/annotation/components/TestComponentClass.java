package com.example.springbootconcepts.annotation.components;

import org.springframework.stereotype.Component;
@Component
public class TestComponentClass {

    public TestComponentClass() {
        System.out.println("No args constructor in component");
    }

    public int add(int x, int y) {
        System.out.println("In the add method");
        return x + y;
    }
}
