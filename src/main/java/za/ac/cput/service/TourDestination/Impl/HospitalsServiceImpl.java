package za.ac.cput.service.TourDestination.Impl;

import za.ac.cput.domain.TourDestination.Hospitals;
import za.ac.cput.repository.TourDestination.HospitalsRepository;
import za.ac.cput.repository.impl.TourDestination.HospitalsRepositoryImpl;
import za.ac.cput.service.TourDestination.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("HospitalsServiceImpl")
public class HospitalsServiceImpl implements HospitalsService{

    @Autowired
    @Qualifier("InMemory")

    private static HospitalsServiceImpl service = null;
    private HospitalsRepository repository;

    private HospitalsServiceImpl() {
        this.repository = HospitalsRepositoryImpl.getRepository();
    }

    public static HospitalsServiceImpl getService(){
        if (service == null) service = new HospitalsServiceImpl();
        return service;
    }

    @Override
    public Hospitals create(Hospitals hospitals) {
        return repository.create(hospitals);
    }

    @Override
    public Hospitals update(Hospitals hospitals) {
        return repository.update(hospitals);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Hospitals read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Hospitals> geetAll() {
        return repository.getAll();
    }
}
