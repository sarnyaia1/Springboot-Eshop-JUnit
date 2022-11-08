package com.spring.tdd.service;


import com.spring.tdd.model.Product;
import com.spring.tdd.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Data Access Object
public class ProductService implements ProductRepository {

    private final List<Product> productList = new ArrayList<>();

    public ProductService() {
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
    public List<Product> fetchAllProducts(){
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
