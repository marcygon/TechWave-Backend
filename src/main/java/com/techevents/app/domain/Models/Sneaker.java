package com.techevents.app.domain.Models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "sneakers")
public class Sneaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String brand;
    private String model;
    private Double price;
    private String img;
    private String description;
    private Boolean highlights;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "admin_id")
    private Admin admin;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

