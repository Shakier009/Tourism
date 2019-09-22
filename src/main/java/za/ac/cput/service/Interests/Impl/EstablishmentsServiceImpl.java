package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.Establishments;
import za.ac.cput.repository.Interests.EstablishmentsRepository;
import za.ac.cput.repository.impl.Interests.EstablishmentsRepositoryImpl;
import za.ac.cput.service.Interests.EstablishmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("EstablishmentsServiceImpl")
public class EstablishmentsServiceImpl implements EstablishmentsService{
    @Autowired
    @Qualifier("InMemory")

    private static EstablishmentsServiceImpl service = null;
    private EstablishmentsRepository repository;

    private EstablishmentsServiceImpl() {
        this.repository = EstablishmentsRepositoryImpl.getRepository();
    }

    public static EstablishmentsServiceImpl getService(){
        if (service == null) service = new EstablishmentsServiceImpl();
        return service;
    }

    @Override
    public Establishments create(Establishments establishments) {
        return repository.create(establishments);
    }

    @Override
    public Establishments update(Establishments establishments) {
        return repository.update(establishments);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Establishments read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Establishments> geetAll() {
        return repository.getAll();
    }
}
