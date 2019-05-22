package za.ac.cput.service.Interests;

import za.ac.cput.domain.Interests.Products
        ;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ProductsServices extends IService<Products, String> {
    Set<Products> geetAll();
}
