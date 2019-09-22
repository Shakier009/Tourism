package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Hotels;
import za.ac.cput.repository.TourDestination.HotelsRepository;
import za.ac.cput.repository.impl.TourDestination.HotelsRepositoryImpl;
import za.ac.cput.service.TourDestination.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("HotelsServiceImpl")
public class HotelsServiceImpl implements HotelsService{

    @Autowired
    @Qualifier("InMemory")

    private static HotelsServiceImpl service = null;
    private HotelsRepository repository;

    private HotelsServiceImpl() {
        this.repository = HotelsRepositoryImpl.getRepository();
    }

    public static HotelsServiceImpl getService(){
        if (service == null) service = new HotelsServiceImpl();
        return service;
    }

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
    public Set<Hotels> geetAll() {
        return repository.getAll();
    }
}
