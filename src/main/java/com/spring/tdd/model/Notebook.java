package com.spring.tdd.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notebook {

    private String productId;
    private String name;
    private double price;
    private String description;
}
