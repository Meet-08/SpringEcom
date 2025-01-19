package com.meet.springecom.controller;

import com.meet.springecom.model.Product;
import com.meet.springecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> products = service.getAllProduct();
        for(var p : products) System.out.println(p);
        return products;
    }

    @Autowired
    public void setService(ProductService service) {
        this.service = service;
    }
}
