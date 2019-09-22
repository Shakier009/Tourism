package za.ac.cput.service.Interests.Impl;

import za.ac.cput.domain.Interests.Products;
import za.ac.cput.repository.Interests.ProductsRepository;
import za.ac.cput.repository.impl.Interests.ProductsRepositoryImpl;
import za.ac.cput.service.Interests.InterestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.service.Interests.ProductsServices;

import java.util.Set;

@Service("ProductsServiceImpl")
public class ProductsServiceImpl implements ProductsServices {
    @Autowired
    @Qualifier("InMemory")

    private static ProductsServiceImpl service = null;
    private ProductsRepository repository;

    private ProductsServiceImpl() {
        this.repository = ProductsRepositoryImpl.getRepository();
    }

    public static ProductsServiceImpl getService(){
        if (service == null) service = new ProductsServiceImpl();
        return service;
    }

    @Override
    public Products create(Products products) {
        return repository.create(products);
    }

    @Override
    public Products update(Products products) {
        return repository.update(products);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Products read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Products> geetAll() {
        return repository.getAll();
    }
}
