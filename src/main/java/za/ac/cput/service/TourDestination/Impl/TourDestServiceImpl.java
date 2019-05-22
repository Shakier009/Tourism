package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.TourDest;
import za.ac.cput.repository.TourDestination.TourDestRepository;
import za.ac.cput.service.TourDestination.TourDestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class TourDestServiceImpl {

    @Autowired
    @Qualifier("InMemory")
    private TourDestRepository repository;

    @Override
    public TourDest create(TourDest tourDest) {
        return repository.create(tourDest);
    }

    @Override
    public TourDest update(TourDest tourDest) {
        return repository.update(tourDest);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public TourDest read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<TourDest> getAll() {
        return repository.getAll();
    }
}
