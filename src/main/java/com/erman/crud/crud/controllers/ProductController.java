package com.erman.crud.crud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String hello() {
        return "Hello word";
    }
}
