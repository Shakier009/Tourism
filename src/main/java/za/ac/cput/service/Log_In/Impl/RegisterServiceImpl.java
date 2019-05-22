package za.ac.cput.service.Log_In.Impl;

import za.ac.cput.domain.Log_In.Register;
import za.ac.cput.repository.Log_In.RegisterRepository;
import za.ac.cput.service.Log_In.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class RegisterServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private RegisterRepository repository;

    @Override
    public Register create(Register register) {
        return repository.create(register);
    }

    @Override
    public Register update(Register register) {
        return repository.update(register);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Register read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Register> getAll() {
        return repository.getAll();
    }
}
