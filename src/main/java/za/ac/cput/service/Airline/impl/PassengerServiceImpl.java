package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.repository.Airline.PassengerRepository;
import za.ac.cput.service.Airline.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


public class PassengerServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private PassengerRepository repository;

    @Override
    public Passenger create(Passenger passenger) {
        return repository.create(passenger);
    }

    @Override
    public Passenger update(Passenger passenger) {
        return repository.update(passenger);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Passenger read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Passenger> getAll() {
        return repository.getAll();
    }
}
