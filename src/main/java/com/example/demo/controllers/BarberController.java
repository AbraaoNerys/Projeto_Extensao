package com.example.demo.controllers;

import com.example.demo.entities.Barber;
import com.example.demo.services.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/barbers")
@CrossOrigin(origins = "*")
public class BarberController {

    @Autowired
    private BarberService service;

    @PostMapping
    public ResponseEntity<Barber> create(@RequestBody Barber barber) {
        return ResponseEntity.ok(service.create(barber));
    }

    @GetMapping
    public ResponseEntity<List<Barber>> list() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barber> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
