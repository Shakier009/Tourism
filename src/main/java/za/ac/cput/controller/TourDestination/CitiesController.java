//package za.ac.cput.controller.TourDestination;
//
//import za.ac.cput.domain.TourDestination.Cities;
//import za.ac.cput.factory.TourDestination.CitiesFactory;
//import za.ac.cput.service.TourDestination.Impl.CitiesServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/Cities")
//public class CitiesController {
//
//    @Autowired
//    private CitiesServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Cities create(@PathVariable  String cityName){
//        Cities cities = CitiesFactory.getCities(cityName);
//        return service.create(cities);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Cities update(Cities cities) {
//        return service.update(cities);
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
//    public Cities read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Cities> getAll(){
//        return service.geetAll();
//    }
//}
