package za.ac.cput.service.Airline;

//import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.domain.Booking;
import za.ac.cput.service.IService;
import za.ac.cput.exception.RecordNotFoundException;
//import za.ac.cput.repository.Airline.BookingRepository;
import za.ac.cput.repository.BookingRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Set;

public interface BookingService extends IService<Booking, String> {


    Booking retrieveBy(String invoice);

    List<Booking> geetAll();
    //Set<Booking> geetAll();
}
