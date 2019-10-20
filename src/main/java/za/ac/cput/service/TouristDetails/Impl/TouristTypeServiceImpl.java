package za.ac.cput.service.TouristDetails.Impl;

import za.ac.cput.domain.TouristDetails.TouristType;
import za.ac.cput.repository.TouristDetails.TouristTypeRepository;
import za.ac.cput.repository.impl.TouristDetails.TouristTypeRepositoryImpl;
import za.ac.cput.service.TouristDetails.TouristTypeServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("TouristTypeServiceImpl")
public class TouristTypeServiceImpl implements TouristTypeServce{



    private static TouristTypeServiceImpl service = null;
    private TouristTypeRepository repository;

    private TouristTypeServiceImpl() {
        this.repository = TouristTypeRepositoryImpl.getRepository();
    }

    public static TouristTypeServiceImpl getService(){
        if (service == null) service = new TouristTypeServiceImpl();
        return service;
    }

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
    public Set<TouristType> geetAll() {
        return repository.getAll();
    }
}
