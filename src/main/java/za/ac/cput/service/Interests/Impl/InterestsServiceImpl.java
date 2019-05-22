package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.Interests;
import za.ac.cput.repository.Interests.InterestsRepository;
import za.ac.cput.service.Interests.InterestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class InterestsServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private InterestsRepository repository;

    @Override
    public Interests create(Interests interests) {
        return repository.create(interests);
    }

    @Override
    public Interests update(Interests interests) {
        return repository.update(interests);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Interests read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Interests> getAll() {
        return repository.getAll();
    }
}
