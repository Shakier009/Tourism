package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.repository.Interests.PlaceIntRepository;
import za.ac.cput.repository.impl.Airline.PlaneRepositoryImpl;
import za.ac.cput.repository.impl.Interests.PlaceIntRepositoryImpl;
import za.ac.cput.service.Interests.PlaceIntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PlaceIntServiceImpl")
public class PlaceIntServiceImpl implements PlaceIntService{
    @Autowired
    @Qualifier("InMemory")

    private static PlaceIntServiceImpl service = null;
    private PlaceIntRepository repository;

    private PlaceIntServiceImpl() {
        this.repository = PlaceIntRepositoryImpl.getRepository();
    }

    public static PlaceIntServiceImpl getService(){
        if (service == null) service = new PlaceIntServiceImpl();
        return service;
    }

    @Override
    public PlaceInt create(PlaceInt placeInt) {
        return repository.create(placeInt);
    }

    @Override
    public PlaceInt update(PlaceInt placeInt) {
        return repository.update(placeInt);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public PlaceInt read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<PlaceInt> geetAll() {
        return repository.getAll();
    }
}
