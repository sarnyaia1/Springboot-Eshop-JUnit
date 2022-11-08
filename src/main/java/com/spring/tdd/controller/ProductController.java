package com.spring.tdd.controller;

import com.spring.tdd.model.Product;
import com.spring.tdd.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping(value = "/products")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @PostMapping(value = "/products")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        boolean result = productService.addProduct(product);
        if(result){
            return ResponseEntity.ok("Product CREATED successfully!!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
