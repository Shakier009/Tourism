package za.ac.cput.service.Log_In.Impl;

import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.repository.Log_In.LogInRepository;
import za.ac.cput.repository.impl.Log_In.LogInRepositoryImpl;
import za.ac.cput.service.Log_In.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LogInServiceImpl")
public class LoginServiceImpl implements LoginService{


    private static LoginServiceImpl service = null;
    private LogInRepository repository;

    private LoginServiceImpl() {
        this.repository = LogInRepositoryImpl.getRepository();
    }

    public static LoginServiceImpl getService(){
        if (service == null) service = new LoginServiceImpl();
        return service;
    }

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
    public Set<LogIn> geetAll() {
        return repository.getAll();
    }
}
