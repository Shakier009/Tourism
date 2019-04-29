package za.ac.cput.repository.Airline;

import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PassengerRepository extends IRepository<Passenger, String>{
    Set<Passenger> getAll();
}
