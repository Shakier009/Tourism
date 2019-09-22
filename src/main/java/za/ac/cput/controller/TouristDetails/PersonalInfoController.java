package za.ac.cput.controller.TouristDetails;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.factory.TouristDetails.PersonalInfoFactory;
import za.ac.cput.service.TouristDetails.Impl.PersonalInfoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/tourism/LogIn")
public class PersonalInfoController {

    @Autowired
    private PersonalInfoServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    PersonalInfo create(@PathVariable  String birthPlce, int age){
        PersonalInfo personalInfo = PersonalInfoFactory.getPersonalInfo(birthPlce, age);
        return service.create(personalInfo);


    }

    @PostMapping("/update")
    @ResponseBody
    public PersonalInfo update(PersonalInfo personalInfo) {
        return service.update(personalInfo);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public PersonalInfo read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<PersonalInfo> getAll(){
        return service.geetAll();
    }
}
