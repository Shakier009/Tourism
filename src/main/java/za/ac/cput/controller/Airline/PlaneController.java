//package za.ac.cput.controller.Airline;
//
//import za.ac.cput.domain.Airline.Plane;
//import za.ac.cput.factory.Airline.PlaneFactory;
//import za.ac.cput.service.Airline.impl.PlaneServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/Plane")
//
//public class PlaneController {
//
//    @Autowired
//    private PlaneServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Plane create(@PathVariable  String plneType, String plneCode){
//        Plane plane = PlaneFactory.getPlane(plneType, plneCode);
//        return service.create(plane);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Plane update(Plane plane) {
//        return service.update(plane);
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
//    public Plane read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Plane> getAll(){
//        return service.geetAll();
//    }}
//
//
