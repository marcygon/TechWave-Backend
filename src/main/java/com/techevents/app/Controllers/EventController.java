package com.techevents.app.Controllers;


import com.techevents.app.Repositories.ICategoryRepository;
import com.techevents.app.domain.Dtos.EventRequest;
import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Services.EventService;
import com.techevents.app.domain.Services.RegisterToEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;
    private final ICategoryRepository categoryRepository;
    private final RegisterToEventService registerService;

    public EventController(EventService eventService, ICategoryRepository categoryRepository, RegisterToEventService registerService) {
        this.eventService = eventService;
        this.categoryRepository = categoryRepository;
        this.registerService = registerService;
    }


    @GetMapping
    public ResponseEntity<List<Event>> getAll(@RequestParam(name = "name", required = false) String name) {
        List<Event> eventsList;
        if(name != null){
            eventsList = eventService.findByName(name);
        }
        else {
            eventsList = eventService.findAll();
        }
        return ResponseEntity.ok(eventsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.eventService.findById(id));
    }

    @GetMapping("/highlights")
    public ResponseEntity<List<Event>> findAllHighLights(@RequestParam(name = "name", required = false) String name){
        List<Event> highlightEventsList;
        if(name != null){
            highlightEventsList = eventService.findByName(name);
        }
        else {
            highlightEventsList = eventService.findAllHighLights();
        }
        return ResponseEntity.ok(highlightEventsList);
    }

    @GetMapping("/available")
    public ResponseEntity<List<Event>> findAvailable(){
        return ResponseEntity.ok(this.eventService.findAvailableEvents());
    }

    @GetMapping("/notAvailable")
    public ResponseEntity<List<Event>> findNotAvailable(){
        return ResponseEntity.ok(this.eventService.findNotAvailableEvents());
    }

    @GetMapping("category/{id}")
    public ResponseEntity<List<Event>> findEventsByCategory(@PathVariable Long id){
        return ResponseEntity.ok(this.eventService.findEventsByCategory(id));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Event> addEvent(@RequestBody EventRequest request){
        return ResponseEntity.ok(this.eventService.addEvent(request));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void deleteById(@PathVariable Long id){
        this.eventService.deleteById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editById(@PathVariable Long id, @RequestBody EventRequest changes){
        this.eventService.editById(id, changes);
    }

    @PostMapping("/{eventId}/registerToEvent")
    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity registerToEvent(@PathVariable Long eventId){
        registerService.loggedUserRegisterToEvent(eventId);
        return ResponseEntity.noContent().build();
        //.orElseThrow(() -> new RuntimeException("In order to register for this event, you must be logged in to your account."));
    }
}
