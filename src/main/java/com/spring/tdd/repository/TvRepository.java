package com.spring.tdd.repository;


import com.spring.tdd.model.Tv;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//Data Access Object
public class TvRepository {


    private final List<Tv> productList = new ArrayList<>();

    public TvRepository() {
        productList.add(Tv.builder()
                .productId("Y1")
                .name("LG 65 Full HD")
                .price(999.99)
                .description("This is a cool LG...")
                .build()
        );
        productList.add(Tv.builder()
                .productId("Y2")
                .name("Panasonic 75 OLED")
                .price(1599.99)
                .description("This is a cool Panasonic...")
                .build()
        );
    }

    public List<Tv> getProducts(){
        return productList;
    }

    public void addProduct(Tv tv) {
        productList.add(tv);
        System.out.println("TV successfully ADDED!");
    }
}
