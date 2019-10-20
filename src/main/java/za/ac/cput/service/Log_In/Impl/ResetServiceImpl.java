package za.ac.cput.service.Log_In.Impl;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.repository.Log_In.ResetRepository;
import za.ac.cput.repository.impl.Log_In.ResetRepositoryImpl;
import za.ac.cput.service.Log_In.ResetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ResetServiceImpl")
public class ResetServiceImpl  implements ResetService{


    private static ResetServiceImpl service = null;
    private ResetRepository repository;

    private ResetServiceImpl() {
        this.repository = ResetRepositoryImpl.getRepository();
    }

    public static ResetServiceImpl getService(){
        if (service == null) service = new ResetServiceImpl();
        return service;
    }

    @Override
    public Reset create(Reset reset) {
        return repository.create(reset);
    }

    @Override
    public Reset update(Reset reset) {
        return repository.update(reset);
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
    public Set<Reset> geetAll() {
        return repository.getAll();
    }
}
