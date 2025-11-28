package com.example.demo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Barber;
import com.example.demo.repositories.BarberRepository;

@Service
public class BarberService {

    @Autowired
    private BarberRepository repository;

    public Barber create(Barber barber) {
        return repository.save(barber);
    }

    public List<Barber> list() {
        return repository.findAll();
    }

    public Barber findById(UUID id) {
        return repository.findById(id).orElse(null);
    }
}
