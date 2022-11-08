package com.spring.tdd.repository;

import com.spring.tdd.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    List<Product> getProducts();

    boolean addProduct(Product product);
}
