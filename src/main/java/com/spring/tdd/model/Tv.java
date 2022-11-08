package com.spring.tdd.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//Data Transfer Object - model/domain?
public class Tv {

    private String productId;
    private String name;
    private double price;
    private String description;
}
