package za.ac.cput.controller.Log_In;

import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.factory.Log_In.LogInFactory;
import za.ac.cput.service.Log_In.Impl.LoginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/LogIn")
public class LogInController {

    @Autowired
    private LoginServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    LogIn create(@PathVariable  String ticketNr){
        LogIn logIn = LogInFactory.buildLogIn(ticketNr);
        return service.create(logIn);

    }

    @PostMapping("/update")
    @ResponseBody
    public LogIn update(LogIn logIn) {
        return service.update(logIn);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public LogIn read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<LogIn> getAll(){
        return service.getAll();
    }
}
