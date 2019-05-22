package za.ac.cput.service.Log_In.Impl;

import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.repository.Log_In.LogInRepository;
import za.ac.cput.service.Log_In.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class LoginServiceImpl {
    @Autowired
    @Qualifier("InMemory")
    private LogInRepository repository;

    @Override
    public LogIn create(LogIn logIn) {
        return repository.create(logIn);
    }

    @Override
    public LogIn update(LogIn logIn) {
        return repository.update(logIn);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public LogIn read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<LogIn> getAll() {
        return repository.getAll();
    }
}
