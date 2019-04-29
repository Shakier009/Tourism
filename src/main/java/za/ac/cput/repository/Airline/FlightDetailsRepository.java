package za.ac.cput.repository.Airline;

import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface FlightDetailsRepository extends IRepository<FlightDetails, String>{
    Set<FlightDetails> getAll();
}
