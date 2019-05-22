package za.ac.cput.controller.TourDestination;

import za.ac.cput.domain.TourDestination.TourDest;
import za.ac.cput.factory.TourDestination.TourDestFactory;
import za.ac.cput.service.TourDestination.Impl.TourDestServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/LogIn")
public class TourDestController {

    @Autowired
    private TourDestServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    TourDest create(@PathVariable  String ticketNr){
        TourDest tourDest = TourDestFactory.buildTourDest(ticketNr);
        return service.create(tourDest);

    }

    @PostMapping("/update")
    @ResponseBody
    public TourDest update(TourDest tourDest) {
        return service.update(tourDest);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TourDest read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<TourDest> getAll(){
        return service.getAll();
    }
}
