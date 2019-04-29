package za.ac.cput.repository.Airline;


import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface BookingRepository extends IRepository<Booking, String>{
    Set<Booking> getAll();
}
