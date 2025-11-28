package com.example.demo.controllers;

import com.example.demo.entities.ServiceEntity;
import com.example.demo.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    @Autowired
    private ServiceService service;

    @PostMapping
    public ResponseEntity<ServiceEntity> create(@RequestBody ServiceEntity serviceEntity) {
        return ResponseEntity.ok(service.create(serviceEntity));
    }

    @GetMapping
    public ResponseEntity<List<ServiceEntity>> list() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceEntity> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
