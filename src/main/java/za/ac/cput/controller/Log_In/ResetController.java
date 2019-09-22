package za.ac.cput.controller.Log_In;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.factory.Log_In.ResetFactory;
import za.ac.cput.service.Log_In.Impl.ResetServiceImpl;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/Attractions")
public class ResetController {

    @Autowired
    private ResetServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Reset create(@PathVariable  String userName, String email){
        Reset reset = ResetFactory.getReset(userName, email);
        return service.create(reset);

    }

    @PostMapping("/update")
    @ResponseBody
    public Reset update(Reset reset) {
        return service.update(reset);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Reset read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Reset> getAll(){
        return service.geetAll();
    }
}
