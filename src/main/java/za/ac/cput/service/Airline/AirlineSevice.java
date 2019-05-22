package za.ac.cput.service.Airline;

import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AirlineSevice extends IService<Airline, String> {
    Set<Airline> geetAll();
}
