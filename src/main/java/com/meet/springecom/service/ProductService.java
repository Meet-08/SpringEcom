package com.meet.springecom.service;

import com.meet.springecom.model.Product;
import com.meet.springecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepo repo;


    public List<Product> getAllProduct(){
        return repo.findAll();
    }

    public ProductRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(ProductRepo repo) {
        this.repo = repo;
    }
}
