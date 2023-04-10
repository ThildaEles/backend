package com.example.backend.controller;

import com.example.backend.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OnlyTestController {

    @GetMapping("/api/products")
    public String getProducts() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("1", "Product 1", 10);
        Product product2 = new Product("2", "Product 2", 20);
        products.add(product1);
        products.add(product2);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(products);
        } catch (Exception e) {
            return null;
       }
   }
}
