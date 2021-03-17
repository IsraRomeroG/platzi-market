package com.isra.platzimarket.web.controller;

import com.isra.platzimarket.persistence.ProductRepository;
import com.isra.platzimarket.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/hola")
    public String saludar(){
        List<Product> all = productRepository.getAll();
        String s = "";
        for (Product p: all) {
            s = s + p.toString();
        }
        return s;
    }
}
