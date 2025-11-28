package com.example.demo.services;

import com.example.demo.entities.ServiceEntity;
import com.example.demo.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository repository;

    public ServiceEntity create(ServiceEntity service) {
        return repository.save(service);
    }

    public List<ServiceEntity> list() {
        return repository.findAll();
    }

    public ServiceEntity findById(UUID id) {
        return repository.findById(id).orElse(null);
    }
}
