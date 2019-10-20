//package za.ac.cput.controller.Airline;
//
//
//import za.ac.cput.domain.Airline.FlightDetails;
//import za.ac.cput.factory.Airline.FlightDetailsFactory;
//import za.ac.cput.service.Airline.impl.FlightDetailsServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/FlightDetails")
//
//public class FlightDetailsController {
//
//    @Autowired
//    private FlightDetailsServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    FlightDetails create(@PathVariable  String flightClss, String flightRow, int flightNr, int flightSeat){
//        FlightDetails flightDetails = FlightDetailsFactory.getFlightDetails(flightClss, flightRow, flightNr, flightSeat);
//        return service.create(flightDetails);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public FlightDetails update(FlightDetails flightDetails) {
//        return service.update(flightDetails);
//    }
//
//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public void delete(@PathVariable String id) {
//        service.delete(id);
//
//    }
//
//    @GetMapping("/read/{id}")
//    @ResponseBody
//    public FlightDetails read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<FlightDetails> getAll(){
//        return service.geetAll();
//    }
//}
