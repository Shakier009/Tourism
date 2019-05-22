package za.ac.cput.controller.TourDestination;

import za.ac.cput.domain.TourDestination.Resturants;
import za.ac.cput.factory.TourDestination.ResturantsFactory;
import za.ac.cput.service.TourDestination.Impl.ResturantsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/LogIn")
public class ResturantsController {

    @Autowired
    private ResturantsServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Resturants create(@PathVariable  String ticketNr){
        Resturants resturants = ResturantsFactory.buildResturants(ticketNr);
        return service.create(resturants);

    }

    @PostMapping("/update")
    @ResponseBody
    public Resturants update(Resturants resturants) {
        return service.update(resturants);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Resturants read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Resturants> getAll(){
        return service.getAll();
    }
}
