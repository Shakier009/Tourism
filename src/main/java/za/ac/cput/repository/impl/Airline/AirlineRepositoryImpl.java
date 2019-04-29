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
        //find the student in the set and return it if it exist
        return null;
    }

    public Airline update(Airline airline) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String ticketNr) {
        //find the student and delete it if it exists

    }

    public Set<Airline> getAll(){
        return this.airline;
    }

}
