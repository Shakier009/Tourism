package za.ac.cput.service.TouristDetails.Impl;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.repository.TouristDetails.PersonalInfoRepository;
import za.ac.cput.service.TouristDetails.PersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class PersonalInfoServiceImpl {

    @Autowired
    @Qualifier("InMemory")
    private PersonalInfoServiceImpl repository;

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
    public Set<PersonalInfo> getAll() {
        return repository.getAll();
    }
}
