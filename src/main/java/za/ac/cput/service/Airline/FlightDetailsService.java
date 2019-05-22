package za.ac.cput.service.Airline;


import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.service.IService;

import java.util.Set;

public interface FlightDetailsService extends IService<FlightDetails, String> {
    Set<FlightDetails> geetAll();
}
