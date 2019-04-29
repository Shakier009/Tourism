package za.ac.cput.repository.Interests;

import za.ac.cput.domain.Interests.Products;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ProductsRepository extends IRepository<Products, String> {
    Set<Products> getAll();
}
