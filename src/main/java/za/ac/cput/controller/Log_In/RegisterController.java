package za.ac.cput.controller.Log_In;

import za.ac.cput.domain.Log_In.Register;
import za.ac.cput.factory.Log_In.RegisterFactory;
import za.ac.cput.service.Log_In.Impl.RegisterServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/Attractions")
public class RegisterController {

    @Autowired
    private RegisterServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Register create(@PathVariable  String ticketNr){
        Register register = RegisterFactory.buildRegister(ticketNr);
        return service.create(register);

    }

    @PostMapping("/update")
    @ResponseBody
    public Register update(Register register) {
        return service.update(register);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Register read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Register> getAll(){
        return service.getAll();
    }
}
