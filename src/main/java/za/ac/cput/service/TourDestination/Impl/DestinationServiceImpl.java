package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Destination;
import za.ac.cput.repository.TourDestination.DestinationRepository;
import za.ac.cput.repository.impl.TourDestination.DestinationRepositoryImpl;
import za.ac.cput.service.TourDestination.DetsinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("DestinationServiceImpl")
public class DestinationServiceImpl implements DetsinationService{

    @Autowired
    @Qualifier("InMemory")

    private static DestinationServiceImpl service = null;
    private DestinationRepository repository;

    private DestinationServiceImpl() {
        this.repository = DestinationRepositoryImpl.getRepository();
    }

    public static DestinationServiceImpl getService(){
        if (service == null) service = new DestinationServiceImpl();
        return service;
    }

    @Override
    public Destination create(Destination destination) {
        return repository.create(destination);
    }

    @Override
    public Destination update(Destination destination) {
        return repository.update(destination);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Destination read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Destination> geetAll() {
        return repository.getAll();
    }
}
