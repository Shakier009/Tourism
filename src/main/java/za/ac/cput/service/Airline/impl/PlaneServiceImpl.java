package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.factory.Airline.PlaneFactory;
import za.ac.cput.repository.Airline.PlaneRepository;
import za.ac.cput.service.Airline.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


public class PlaneServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private PlaneRepository repository;

    @Override
    public Plane create(Plane plane) {
        return repository.create(plane);
    }

    @Override
    public Plane update(Plane plane) {
        return repository.update(plane);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Plane read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Plane> getAll() {
        return repository.getAll();
    }
}
