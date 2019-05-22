package za.ac.cput.controller.Interests;

import za.ac.cput.domain.Interests.Products;
import za.ac.cput.factory.Interests.ProductsFactory;
import za.ac.cput.service.Interests.Impl.ProductsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/tourism/Products")
public class ProductsController {

    @Autowired
    private ProductsServiceImpl service;

    @GetMapping("/create/{ticketNr}")
    public @ResponseBody
    Products create(@PathVariable  String ticketNr){
        Products products = ProductsFactory.buildProducts(ticketNr);
        return service.create(products);

    }

    @PostMapping("/update")
    @ResponseBody
    public Products update(Products products) {
        return service.update(products);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Products read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Products> getAll(){
        return service.getAll();
    }
}
