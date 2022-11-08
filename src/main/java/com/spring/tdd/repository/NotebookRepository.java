package com.spring.tdd.repository;


import com.spring.tdd.model.Notebook;
import com.spring.tdd.model.Tv;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
//Data Access Object
public class NotebookRepository {

    private final List<Notebook> productList = new ArrayList<>();

    public NotebookRepository() {
        productList.add(Notebook.builder()
                        .productId("X1")
                        .name("Macbook Pro 13")
                        .price(999.99)
                        .description("This is a cool Macbook...")
                        .build()
        );
        productList.add(Notebook.builder()
                .productId("X2")
                .name("Asus Zero")
                .price(599.99)
                .description("This is a cool Asus...")
                .build()
        );

    }

    public List<Notebook> getProducts(){
        return productList;
    }

    public void addProduct(Notebook notebook) {
        productList.add(notebook);
        ResponseEntity.ok("Notebook successfully ADDED!");
    }
}
