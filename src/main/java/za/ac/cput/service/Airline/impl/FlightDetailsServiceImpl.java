package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.repository.Airline.FlightDetailsRepository;
import za.ac.cput.repository.impl.Airline.FlightDetailsRepositoryImpl;
import za.ac.cput.service.Airline.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("FlightDetailsServiceImpl")
public class FlightDetailsServiceImpl implements FlightDetailsService{



    private static FlightDetailsServiceImpl service = null;
    private FlightDetailsRepository repository;

    private FlightDetailsServiceImpl() {
        this.repository = FlightDetailsRepositoryImpl.getRepository();
    }

    public static FlightDetailsServiceImpl getService(){
        if (service == null) service = new FlightDetailsServiceImpl();
        return service;
    }

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
    public Set<FlightDetails> geetAll() {
        return repository.getAll();
    }
}
