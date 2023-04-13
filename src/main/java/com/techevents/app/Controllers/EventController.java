package com.techevents.app.Controllers;


import com.techevents.app.Repositories.ICategoryRepository;
import com.techevents.app.domain.Dtos.EventRequest;
import com.techevents.app.domain.Models.Event;
import com.techevents.app.domain.Services.EventService;
//import com.techevents.app.infrastructure.Repositories.ICategoryRepository;
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

    public EventController(EventService eventService, ICategoryRepository categoryRepository) {
        this.eventService = eventService;
        this.categoryRepository = categoryRepository;
    }


    @GetMapping
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(this.eventService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.eventService.findById(id));
    }

    @GetMapping("/highlights")
    public ResponseEntity<List<Event>> findAllHighLights(){
        return ResponseEntity.ok(this.eventService.findAllHighLights());
    }

    @GetMapping("category/{id}")
    public ResponseEntity<List<Event>> findEventsByCategory(@PathVariable Long id){
        return ResponseEntity.ok(this.eventService.findEventsByCategory(id));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Event> addSneaker(@RequestBody EventRequest request){
        return ResponseEntity.ok(this.eventService.addEvent(request));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        this.eventService.deleteById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/{id}")
    public void editById(@PathVariable Long id, @RequestBody EventRequest changes){
        this.eventService.editById(id, changes);
    }
}