package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Resturants;
import za.ac.cput.repository.TourDestination.ResturantsRepository;
import za.ac.cput.repository.impl.TourDestination.ResturantsRepositoryImpl;
import za.ac.cput.service.Log_In.ResetService;
import za.ac.cput.service.TourDestination.ResturantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ResturantsServiceImpl")
public class ResturantsServiceImpl implements ResturantsService {


    private static ResturantsServiceImpl service = null;
    private ResturantsRepository repository;

    private ResturantsServiceImpl() {
        this.repository = ResturantsRepositoryImpl.getRepository();
    }

    public static ResturantsServiceImpl getService(){
        if (service == null) service = new ResturantsServiceImpl();
        return service;
    }

    @Override
    public Resturants create(Resturants resturants) {
        return repository.create(resturants);
    }

    @Override
    public Resturants update(Resturants resturants) {
        return repository.update(resturants);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Resturants read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Resturants> geetAll() {
        return repository.getAll();
    }
}
