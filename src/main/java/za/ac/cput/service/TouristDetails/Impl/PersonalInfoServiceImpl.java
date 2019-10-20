package za.ac.cput.service.TouristDetails.Impl;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.repository.TouristDetails.PersonalInfoRepository;
import za.ac.cput.repository.impl.TouristDetails.PersonalInfoRepositoryImpl;
import za.ac.cput.service.TouristDetails.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PersonalInfoServiceImpl")
public class PersonalInfoServiceImpl implements PersonalInfoService{


    private static PersonalInfoServiceImpl service = null;
    private PersonalInfoRepository repository;

    private PersonalInfoServiceImpl() {
        this.repository = PersonalInfoRepositoryImpl.getRepository();
    }

    public static PersonalInfoServiceImpl getService(){
        if (service == null) service = new PersonalInfoServiceImpl();
        return service;
    }

    @Override
    public PersonalInfo create(PersonalInfo personalInfo) {
        return repository.create(personalInfo);
    }

    @Override
    public PersonalInfo update(PersonalInfo personalInfo) {
        return repository.update(personalInfo);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public PersonalInfo read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<PersonalInfo> geetAll() {
        return repository.getAll();
    }
}
