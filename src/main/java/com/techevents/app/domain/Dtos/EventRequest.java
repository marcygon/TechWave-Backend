package com.techevents.app.domain.Dtos;

import lombok.Data;


@Data
public class EventRequest {
    private String name;
    private String organizer;
    private String description;
    private Boolean highlights;
    private String img;
    private String location;
    private String eventDate;
    private String eventHour;

    //private Integer maxParticipants;
    private Long categoryId;

}