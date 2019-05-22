package za.ac.cput.controller.Airline;

import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.factory.Airline.BookingFactory;
import za.ac.cput.service.Airline.impl.BookingServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.awt.print.Book;
import java.util.Set;


@RestController
@RequestMapping("/tourism/Booking")

public class BookingController {

    @Autowired
    private BookingServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Booking create(@PathVariable  String ticketNr){
        Booking booking = BookingFactory.buildBooking(ticketNr);
        return service.create(booking);

    }

    @PostMapping("/update")
    @ResponseBody
    public Booking update(Booking booking) {
        return service.update(booking);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Booking read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Booking> getAll(){
        return service.getAll();
    }
}
