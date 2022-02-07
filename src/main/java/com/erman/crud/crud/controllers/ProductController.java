package com.erman.crud.crud.controllers;

import com.erman.crud.crud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String hello() {
        return "Hello word";
    }

    public

}
