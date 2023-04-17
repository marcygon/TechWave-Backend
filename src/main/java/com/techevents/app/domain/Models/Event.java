package com.techevents.app.domain.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.*;
import java.util.*;



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
    private Integer maxParticipants = 15;
    private Integer participants = 0;

    public boolean isAvailable() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        if (eventDate.isBefore(currentDate) || (eventDate.equals(currentDate) && eventHour.isBefore(currentTime))) {
            return false;
        }
        return true;
    }
    public boolean registerParticipant() {
        if (participants < maxParticipants) {
            participants++;
            return true;
        }
        return false;
    }

    //@OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<EventRegistration> registrations = new ArrayList<>();
    //@ManyToOne
    //@JoinColumn(name = "category_id")
    //private Category category;
}

