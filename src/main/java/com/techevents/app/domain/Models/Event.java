package com.techevents.app.domain.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.techevents.app.security.user.User;
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
    private String organizer;
    @Column(name = "description", length = 1000)
    private String description;
    private Boolean highlights;
    private String img;
    private String location;
    private LocalDate eventDate;
    private LocalTime eventHour;
    private Integer maxParticipants;


    public Boolean isAvailable() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        if (eventDate.isBefore(currentDate) || (eventDate.equals(currentDate) && eventHour.isBefore(currentTime))) {
            return false;
        }
        return true;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private Boolean registration;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<RegisterToEvent> registersToEvent;

    @JsonProperty
    public Integer registersCount(){
        return this.registersToEvent.size();
    }

    public Boolean alreadyRegistered(User user) {
        if(registersToEvent.stream().anyMatch(registerToEvent -> registerToEvent.getUser().equals(user))){
            this.registration = true;
            return true;
        }
        this.registration = false;
        return false;
    }

}

