package com.example.demo.services;

import com.example.demo.entities.Appointment;
import com.example.demo.entities.AppointmentStatus;
import com.example.demo.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public Appointment create(Appointment appointment) {
        return repository.save(appointment);
    }

    public List<Appointment> list() {
        return repository.findAll();
    }

    public Appointment findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public Appointment updateStatus(UUID id, AppointmentStatus status) {
        Appointment ap = findById(id);

        if (ap == null) return null;

        ap.setStatus(status);
        return repository.save(ap);
    }
}
