package com.techevents.app.domain.Services;

import com.techevents.app.domain.Dtos.EventRequest;
import com.techevents.app.domain.Models.Event;
import com.techevents.app.Repositories.ICategoryRepository;
import com.techevents.app.Repositories.IEventRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

@Service
public class EventService {
    private final IEventRepository eventRepository;
    private final AdminService adminService;
    private final ICategoryRepository categoryRepository;



    public EventService(IEventRepository eventRepository, AdminService adminService, ICategoryRepository categoryRepository) {
        this.eventRepository = eventRepository;
        this.adminService = adminService;
        this.categoryRepository = categoryRepository;
    }
    public List<Event> findAll(){
        return this.eventRepository.findAll();
    }

    public Event findById(Long id) {
        var eventOptional = this.eventRepository.findById(id);
        if(eventOptional.isEmpty()) throw new RuntimeException("The event with id: " + id + " doesn't exist in our Data Base. Please try again with other id.");
        return eventOptional.get();
    }

    public List<Event> findAllHighLights(){
        var events = eventRepository.findByHighlightsTrue();
        return events;
    }

    public List<Event> findEventsByCategory(@PathVariable Long id){
        return eventRepository.findByCategory_Id(id);
    }

    public static boolean validateURL(String urlString){
        try{
            new URL(urlString).toURI();
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public Event addEvent(EventRequest request) {
        var category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new RuntimeException("This category doesn't exist. Please try again."));

        LocalDate eventDate = LocalDate.parse(request.getEventDate(),DateTimeFormatter.ISO_LOCAL_DATE);
        LocalTime eventHour = LocalTime.parse(request.getEventHour().trim(),DateTimeFormatter.ofPattern("HH:mm:ss"));

        var event = new Event();
        var urlDefault = "https://static.thenounproject.com/png/1554489-200.png";

        event.setName(request.getName());
        event.setOrganitzer(request.getOrganitzer());
        event.setDescription(request.getDescription());
        event.setHighlights(request.getHighlights());
        event.setLocation(request.getLocation());
        event.setCategory(category);

        event.setImg(request.getImg());
        if(validateURL(request.getImg()) == false){
            event.setImg(urlDefault);
        }

        event.setEventDate(eventDate);
        event.setEventHour(eventHour);

        return this.eventRepository.save(event);
    }

    public void deleteById(Long eventId) {
        var event = eventRepository.findById(eventId).get();
        this.eventRepository.deleteById(eventId);
    }

    public void editById(Long eventId, EventRequest newEvent){
        var event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));
        var category = categoryRepository.findById(newEvent.getCategoryId()).orElseThrow(() -> new RuntimeException("Category not found"));

        event.setName(newEvent.getName());
        event.setOrganitzer(newEvent.getOrganitzer());
        event.setDescription(newEvent.getDescription());
        event.setHighlights(newEvent.getHighlights());
        event.setLocation(newEvent.getLocation());
        //event.setEventDateTime(newEvent.getEventDateTime());
        event.setCategory(category);
        event.setImg(newEvent.getImg());
        eventRepository.save(event);
    }
}
