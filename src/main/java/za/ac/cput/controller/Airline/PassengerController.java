package za.ac.cput.controller.Airline;

import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.factory.Airline.PassengerFactory;
import za.ac.cput.service.Airline.impl.PassengerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/Passenger")

public class PassengerController {

    @Autowired
    private PassengerServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Passenger create(@PathVariable  String psnName, String psnSName, String psngerId, int age){
        Passenger passenger = PassengerFactory.getPassenger(psnName, psnSName, psngerId, age);
        return service.create(passenger);

    }

    @PostMapping("/update")
    @ResponseBody
    public Passenger update(Passenger passenger) {
        return service.update(passenger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Passenger read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Passenger> getAll(){
        return service.geetAll();
    }
}
