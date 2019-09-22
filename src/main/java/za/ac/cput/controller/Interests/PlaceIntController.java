package za.ac.cput.controller.Interests;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.factory.Interests.PlaceIntFactory;
import za.ac.cput.service.Interests.Impl.PlaceIntServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/tourism/PlaceInt")
public class PlaceIntController {

    @Autowired
    private PlaceIntServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    PlaceInt create(@PathVariable  String plcName,String  plcLoc){
        PlaceInt placeInt = PlaceIntFactory.getPlaceInt(plcName, plcLoc);
        return service.create(placeInt);

    }

    @PostMapping("/update")
    @ResponseBody
    public PlaceInt update(PlaceInt placeInt) {
        return service.update(placeInt);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PlaceInt read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<PlaceInt> getAll(){
        return service.geetAll();
    }
}
