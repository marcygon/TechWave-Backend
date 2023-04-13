package com.techevents.app.domain.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.*;
import java.time.format.*;


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
    @Column(name = "description", length = 1000)
    private String description;
    private Boolean highlights;
    private String img;
    private String location;
    private LocalDate eventDate;
    private LocalTime eventHour;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

