//package za.ac.cput.controller.Interests;
//
//import za.ac.cput.domain.Interests.Establishments;
//import za.ac.cput.factory.Interests.EstablishmentsFactory;
//import za.ac.cput.service.Interests.Impl.EstablishmentsServiceImpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/tourism/Establishments")
//public class EstablishmentsController {
//
//    @Autowired
//    private EstablishmentsServiceImpl service;
//
//    @GetMapping("/create/{ticketNr}")
//    public @ResponseBody
//    Establishments create(@PathVariable  String location, String estId){
//        Establishments establishments = EstablishmentsFactory.getEstablishments(location, estId);
//        return service.create(establishments);
//
//    }
//
//    @PostMapping("/update")
//    @ResponseBody
//    public Establishments update(Establishments establishments) {
//        return service.update(establishments);
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
//    public Establishments read(@PathVariable String id) {
//        return service.read(id);
//    }
//
//    @GetMapping("/getall")
//    @ResponseBody
//    public Set<Establishments> getAll(){
//        return service.geetAll();
//    }
//}
