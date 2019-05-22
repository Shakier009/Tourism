package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.repository.Airline.FlightDetailsRepository;
import za.ac.cput.service.Airline.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


public class FlightDetailsServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private FlightDetailsRepository repository;

    @Override
    public FlightDetails create(FlightDetails flightDetails) {
        return repository.create(flightDetails);
    }

    @Override
    public FlightDetails update(FlightDetails flightDetails) {
        return repository.update(flightDetails);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public FlightDetails read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<FlightDetails> getAll() {
        return repository.getAll();
    }
}
