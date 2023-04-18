package com.techevents.app.domain.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    private Integer maxParticipants;

    //private Integer participants = 0; no tiene sentido esto ya que lo va contando el


    public Boolean isAvailable() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        if (eventDate.isBefore(currentDate) || (eventDate.equals(currentDate) && eventHour.isBefore(currentTime))) {
            return false;
        }
        return true;
    }

    //public Boolean registerParticipant() {
        //if (isAvailable() && participants < maxParticipants) {
            //participants++;
            //return true;
        //}
        //return false;
    //}

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<RegisterToEvent> registersToEvent;

    @JsonProperty
    public Integer registersCount(){
        return this.registersToEvent.size();
    }
}

