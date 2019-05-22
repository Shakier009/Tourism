package za.ac.cput.repository.impl.Airline;

import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.repository.Airline.AirlineRepository;

import java.util.HashSet;
import java.util.Set;

public class AirlineRepositoryImpl implements AirlineRepository{

    private static AirlineRepositoryImpl repository = null;
    private Set<Airline> airline;

    private AirlineRepositoryImpl() {
        this.airline = new HashSet<>();
    }

    public static AirlineRepository getRepository(){
        if(repository == null) repository = new AirlineRepositoryImpl();
        return repository;
    }

    public Airline create(Airline airline){
        this.airline.add(airline);
        return airline;
    }

    public Airline read(String ticketNr){

        return null;
    }

    public Airline update(Airline airline) {
        return null;
    }

    public void delete(String ticketNr) {

    }

    public Set<Airline> getAll(){
        return this.airline;
    }

}
