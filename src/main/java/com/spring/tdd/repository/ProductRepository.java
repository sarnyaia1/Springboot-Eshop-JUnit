package com.spring.tdd.repository;


import com.spring.tdd.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//Data Access Object
public class ProductRepository implements ProductInterface{

    private final List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        productList.add(Product.builder()
                        .productId("X1")
                        .name("Macbook Pro 13")
                        .price(799.99)
                        .description("This is a cool Macbook...")
                        .build()
        );
        productList.add(Product.builder()
                .productId("Y1")
                .name("LG Full HD Tv")
                .price(849.99)
                .description("This is a cool LG TV...")
                .build()
        );

    }

    @Override
    public List<Product> getProducts(){
        return productList;
    }

    @Override
    public boolean addProduct(Product product) {
        try {
            productList.add(product);
            return true;
        } catch (Exception exception){
            exception.printStackTrace();
            return false;
        }
    }


}
