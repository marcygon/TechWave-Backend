package com.techevents.app.domain.Dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
public class EventRequest {
    private String name;
    private String organitzer;
    private String description;
    private Boolean highlights;
    private String img;
    private String location;
    private String eventDate;
    private String eventHour;
    //private Integer maxParticipants;
    //private Integer participants;

    private Long categoryId;

}