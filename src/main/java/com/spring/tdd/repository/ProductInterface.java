package com.spring.tdd.repository;

import com.spring.tdd.model.Product;

import java.util.List;

public interface ProductInterface {

    List<Product> getProducts();

    boolean addProduct(Product product);
}
