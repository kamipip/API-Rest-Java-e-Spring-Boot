package com.treino.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treino.demo.entities.Department;
import com.treino.demo.entities.Product;

import java.util.List;  
import java.util.Arrays;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getObjects() {
        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");

        Product p1 = new Product(1L, "Mackbook Pro", 4000.0, d1);
        Product p2 = new Product(2L, "Pc gamer", 4500.0, d1);
        Product p3 = new Product(3L, "Ração 1kg", 20.0, d2);
        
        List<Product> list = Arrays.asList(p1, p2, p3);

        return list;
    }
}
