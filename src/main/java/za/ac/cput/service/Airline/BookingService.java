package za.ac.cput.service.Airline;

import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.service.IService;

import java.util.Set;

public interface BookingService extends IService<Booking, String> {
    Set<Booking> geetAll();
}
