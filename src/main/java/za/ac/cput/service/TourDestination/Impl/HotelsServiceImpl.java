package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Hotels;
import za.ac.cput.repository.TourDestination.HotelsRepository;
import za.ac.cput.service.TourDestination.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class HotelsServiceImpl {

    @Autowired
    @Qualifier("InMemory")
    private HotelsRepository repository;

    @Override
    public Hotels create(Hotels hotels) {
        return repository.create(hotels);
    }

    @Override
    public Hotels update(Hotels hotels) {
        return repository.update(hotels);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Hotels read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Hotels> getAll() {
        return repository.getAll();
    }
}
