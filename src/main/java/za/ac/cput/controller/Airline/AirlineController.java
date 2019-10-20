//package za.ac.cput.controller.Airline;
//
//import org.springframework.stereotype.Controller;
//import za.ac.cput.domain.Airline.Airline;
//import za.ac.cput.factory.Airline.AirlineFactory;
//import za.ac.cput.service.Airline.impl.AirlineServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("Airline")
//public class AirlineController {
//
//    @Autowired
//    private AirlineServiceImpl airlineService;
//
//    @PostMapping
//    public Airline create(@RequestBody Airline airline){
//
//        return airlineService.create(airline);
//    }
//
//    @Controller("/review")
//    public class ReviewController {}
//    @Controller("/book")
//    public class BookController {}
//
//    @Autowired
//    private AirlineServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Airline create(@PathVariable  String ticketNr){
//        Airline airline = AirlineFactory.getAirline(ticketNr);
//        return service.create(airline);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Airline update(Airline airline) {
//        return service.update(airline);
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
//    public Airline read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Airline> getAll(){
//        return service.geetAll();
//    }
//
//}
