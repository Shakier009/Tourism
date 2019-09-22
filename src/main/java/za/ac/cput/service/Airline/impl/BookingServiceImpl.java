package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.repository.Airline.BookingRepository;
import za.ac.cput.repository.impl.Airline.BookingRepositoryImpl;
import za.ac.cput.service.Airline.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("BookingServiceImpl")
public class BookingServiceImpl implements BookingService{
    @Autowired
    @Qualifier("InMemory")

    private static BookingServiceImpl service = null;
    private BookingRepository repository;

    private BookingServiceImpl() {
        this.repository = BookingRepositoryImpl.getRepository();
    }

    public static BookingServiceImpl getService(){
        if (service == null) service = new BookingServiceImpl();
        return service;
    }

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
    public Set<Booking> geetAll() {
        return repository.getAll();
    }

}
