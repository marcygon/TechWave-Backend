package com.techevents.app.domain.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;



@Entity
@Data
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String organitzer;
    private String description;
    private Boolean highlights;
    private String img;
    private String location;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime eventDateTime;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

