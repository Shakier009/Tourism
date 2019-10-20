//package za.ac.cput.controller.TourDestination;
//
//import za.ac.cput.domain.TourDestination.Hospitals;
//import za.ac.cput.factory.TourDestination.HospitalsFactory;
//import za.ac.cput.service.TourDestination.Impl.HospitalsServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/Hosptitals")
//public class HosptitalsController {
//
//    @Autowired
//    private HospitalsServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Hospitals create(@PathVariable  String hospName, String hospCode, String hospArea){
//        Hospitals hospitals = HospitalsFactory.getHospitals(hospName, hospCode, hospArea);
//        return service.create(hospitals);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Hospitals update(Hospitals hospitals) {
//        return service.update(hospitals);
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
//    public Hospitals read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Hospitals> getAll(){
//        return service.geetAll();
//    }
//}
