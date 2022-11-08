package com.spring.tdd.repository;

import com.spring.tdd.model.Tv;

import java.util.List;

public interface ProductRepository {

    List<Tv> getProducts();

    void addProduct();
}
