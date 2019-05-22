package za.ac.cput.service.Airline;


import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PassengerService extends IService<Passenger, String> {
    Set<Passenger> geetAll();
}
