package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.repository.Airline.BookingRepository;
import za.ac.cput.service.Airline.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;


public class BookingServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private BookingRepository repository;

    @Override
    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return repository.update(booking);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Booking read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }
}
