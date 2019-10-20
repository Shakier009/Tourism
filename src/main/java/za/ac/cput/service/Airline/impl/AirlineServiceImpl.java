package za.ac.cput.service.Airline.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.repository.Airline.AirlineRepository;
import za.ac.cput.repository.impl.Airline.AirlineRepositoryImpl;
import za.ac.cput.service.Airline.AirlineSevice;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("AirlineServiceImpl")
public class AirlineServiceImpl implements AirlineSevice{

    private static AirlineServiceImpl service = null;
    private AirlineRepository repository;

    private AirlineServiceImpl() {
        this.repository = AirlineRepositoryImpl.getRepository();
    }

    public static AirlineServiceImpl getService(){
        if (service == null) service = new AirlineServiceImpl();
        return service;
    }

    @Override
    public Airline create(Airline airline) {
        return this.repository.create(airline);
    }

    @Override
    public Airline update(Airline airline) {
        return this.repository.update(airline);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Airline read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Airline> geetAll() {
        return this.repository.getAll();
    }

    /*@Override
    public Set<Airline> geetAll() {
        return null;
    }*/
}



