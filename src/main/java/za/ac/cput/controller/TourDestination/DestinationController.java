//package za.ac.cput.controller.TourDestination;
//
//import za.ac.cput.domain.TourDestination.Destination;
//import za.ac.cput.factory.TourDestination.DestinationFactory;
//import za.ac.cput.service.TourDestination.Impl.DestinationServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/Destination")
//public class DestinationController {
//
//    @Autowired
//    private DestinationServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Destination create(@PathVariable  String destType, String location){
//        Destination destination = DestinationFactory.getDestination(destType, location);
//        return service.create(destination);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Destination update(Destination destination) {
//        return service.update(destination);
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
//    public Destination read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Destination> getAll(){
//        return service.geetAll();
//    }
//}
