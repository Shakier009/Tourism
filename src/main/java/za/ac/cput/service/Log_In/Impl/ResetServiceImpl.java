package za.ac.cput.service.Log_In.Impl;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.repository.Log_In.ResetRepository;
import za.ac.cput.service.Log_In.ResetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class ResetServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private ResetRepository repository;

    @Override
    public Reset create(Reset reset) {
        return repository.create(reset);
    }

    @Override
    public Reset update(Reset reset) {
        return repository.update(attractions);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Reset read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Reset> getAll() {
        return repository.getAll();
    }
}
