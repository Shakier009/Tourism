package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.repository.Interests.AttractionsRepository;
import za.ac.cput.service.Interests.AttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class AttractionsServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private AttractionsRepository repository;

    @Override
    public Attractions create(Attractions attractions) {
        return repository.create(attractions);
    }

    @Override
    public Attractions update(Attractions attractions) {
        return repository.update(attractions);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Attractions read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Attractions> getAll() {
        return repository.getAll();
    }
}
