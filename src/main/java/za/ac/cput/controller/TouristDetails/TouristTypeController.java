//package za.ac.cput.controller.TouristDetails;
//
//import za.ac.cput.domain.TouristDetails.TouristType;
//import za.ac.cput.factory.TouristDetails.TouristTypeFactory;
//import za.ac.cput.service.TouristDetails.Impl.TouristTypeServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//
//@RestController
//@RequestMapping("/tourism/TouristType")
//public class TouristTypeController {
//
//    @Autowired
//    private TouristTypeServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    TouristType create(@PathVariable  String ticketNr){
//        TouristType touristType = TouristTypeFactory.getTouristType(ticketNr);
//        return service.create(touristType);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public TouristType update(TouristType touristType) {
//        return service.update(touristType);
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
//    public TouristType read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<TouristType> getAll(){
//        return service.geetAll();
//    }
//}
