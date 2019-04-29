package za.ac.cput.repository.Airline;

import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.repository.IRepository;


import java.util.HashSet;
import java.util.Set;

public interface AirlineRepository extends IRepository<Airline, String>{
    Set<Airline> getAll();
}
