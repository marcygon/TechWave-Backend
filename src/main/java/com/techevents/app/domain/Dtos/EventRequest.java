package com.techevents.app.domain.Dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventRequest {
    private String name;
    private String organitzer;
    private String description;
    private Boolean highlights;
    private String img;
    private String location;
    private LocalDateTime eventDateTime;
    private Long categoryId;

}