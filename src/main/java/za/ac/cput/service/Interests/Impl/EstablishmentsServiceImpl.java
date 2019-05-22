package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.Establishments;
import za.ac.cput.repository.Interests.EstablishmentsRepository;
import za.ac.cput.service.Interests.EstablishmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class EstablishmentsServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private EstablishmentsRepository repository;

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
    public Set<Establishments> getAll() {
        return repository.getAll();
    }
}
