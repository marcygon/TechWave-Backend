package com.techevents.app.domain.Dtos;

import lombok.Data;

@Data
public class SneakerRequest {
    private String brand;
    private String model;
    private Double price;
    private String img;
    private String description;
    private Boolean highlights;
    private Long categoryId;

}