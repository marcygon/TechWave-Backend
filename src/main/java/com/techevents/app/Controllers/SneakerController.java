package com.techevents.app.Controllers;


import com.techevents.app.Repositories.ICategoryRepository;
import com.techevents.app.domain.Dtos.SneakerRequest;
import com.techevents.app.domain.Models.Sneaker;
import com.techevents.app.domain.Services.SneakerService;
//import com.techevents.app.infrastructure.Repositories.ICategoryRepository;
import com.techevents.app.Repositories.ICategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/sneakers")
public class SneakerController {

    private final SneakerService sneakerService;
    private final ICategoryRepository categoryRepository;

    public SneakerController(SneakerService sneakerService, ICategoryRepository categoryRepository) {
        this.sneakerService = sneakerService;
        this.categoryRepository = categoryRepository;
    }


    @GetMapping
    public ResponseEntity<List<Sneaker>> getAll() {
        return ResponseEntity.ok(this.sneakerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sneaker> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.sneakerService.findById(id));
    }

    @GetMapping("/highlights")
    public ResponseEntity<List<Sneaker>> findAllHighLights(){
        return ResponseEntity.ok(this.sneakerService.findAllHighLights());
    }

    @GetMapping("category/{id}")
    public ResponseEntity<List<Sneaker>> findSneakersByCategory(@PathVariable Long id){
        return ResponseEntity.ok(this.sneakerService.findSneakersByCategory(id));
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Sneaker> addSneaker(@RequestBody SneakerRequest request){
        return ResponseEntity.ok(this.sneakerService.addSneaker(request));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        this.sneakerService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void editById(@PathVariable Long id, @RequestBody SneakerRequest changes){
        this.sneakerService.editById(id, changes);
    }









/*

    @PutMapping("{id}")
    public Sneaker updateById(@PathVariable Long id, @RequestBody Sneaker sneaker){
        return sneakerRepository.updateSneaker(id, sneaker);
    }

    @GetMapping("search")
    public List<Sneaker> searchBy(@RequestParam(required = false) String brand){
        return sneakerRepository.searchBy(brand);
    }
    */



}
