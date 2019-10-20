//package za.ac.cput.controller.TourDestination;
//
//import za.ac.cput.domain.TourDestination.Hotels;
//import za.ac.cput.factory.TourDestination.HotelsFactory;
//import za.ac.cput.service.TourDestination.Impl.HotelsServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/Hotels")
//public class HotelsController {
//
//    @Autowired
//    private HotelsServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Hotels create(@PathVariable  String HotName, String hotLocation){
//        Hotels hotels = HotelsFactory.getHotels(HotName, hotLocation);
//        return service.create(hotels);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Hotels update(Hotels hotels) {
//        return service.update(hotels);
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
//    public Hotels read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Hotels> getAll(){
//        return service.geetAll();
//    }
//}
