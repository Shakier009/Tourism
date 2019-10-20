//package za.ac.cput.controller.Interests;
//
//import za.ac.cput.domain.Interests.Interests;
//import za.ac.cput.factory.Interests.InterestsFactory;
//import za.ac.cput.service.Interests.Impl.InterestsServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/tourism/Interests")
//public class InterestsController {
//
//    @Autowired
//    private InterestsServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Interests create(@PathVariable  String intrName, String plceIntr){
//        Interests interests = InterestsFactory.getInterests(intrName, plceIntr);
//        return service.create(interests);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Interests update(Interests interests) {
//        return service.update(interests);
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
//    public Interests read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Interests> getAll(){
//        return service.geetAll();
//    }
//}
