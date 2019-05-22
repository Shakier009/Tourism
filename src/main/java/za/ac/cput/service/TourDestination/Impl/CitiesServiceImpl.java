package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Cities;
import za.ac.cput.repository.TourDestination.CitiesRepository;
import za.ac.cput.service.TourDestination.TourDestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class CitiesServiceImpl {

    @Autowired
    @Qualifier("InMemory")
    private CitiesRepository repository;

    @Override
    public Cities create(Cities cities) {
        return repository.create(cities);
    }

    @Override
    public Cities update(Cities cities) {
        return repository.update(cities);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Cities read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Cities> getAll() {
        return repository.getAll();
    }
}
