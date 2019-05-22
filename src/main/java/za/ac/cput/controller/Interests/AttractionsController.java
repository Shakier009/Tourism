package za.ac.cput.controller.Interests;

import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.factory.Interests.AttractionsFactory;
import za.ac.cput.service.Interests.Impl.AttractionsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/Attractions")
public class AttractionsController {

    @Autowired
    private AttractionsServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Attractions create(@PathVariable  String ticketNr){
        Attractions attractions = AttractionsFactory.buildAttractions(ticketNr);
        return service.create(attractions);

    }

    @PostMapping("/update")
    @ResponseBody
    public Attractions update(Attractions attractions) {
        return service.update(attractions);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Attractions read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Attractions> getAll(){
        return service.getAll();
    }

}
