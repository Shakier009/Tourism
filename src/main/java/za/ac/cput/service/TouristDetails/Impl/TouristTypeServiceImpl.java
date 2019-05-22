package za.ac.cput.service.TouristDetails.Impl;

import za.ac.cput.domain.TouristDetails.TouristType;
import za.ac.cput.repository.TouristDetails.TouristTypeRepository;
import za.ac.cput.service.TouristDetails.TouristTypeServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class TouristTypeServiceImpl {

    @Autowired
    @Qualifier("InMemory")
    private TouristTypeServiceImpl repository;

    @Override
    public TouristType create(TouristType touristType) {
        return repository.create(touristType);
    }

    @Override
    public TouristType update(TouristType touristType) {
        return repository.update(touristType);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public TouristType read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<TouristType> getAll() {
        return repository.getAll();
    }
}
