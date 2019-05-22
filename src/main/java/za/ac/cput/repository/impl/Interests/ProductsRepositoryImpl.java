package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.Products;
import za.ac.cput.repository.Interests.ProductsRepository;
import za.ac.cput.repository.impl.Airline.AirlineRepositoryImpl;

import java.util.HashSet;
import java.util.Set;

    public class ProductsRepositoryImpl implements ProductsRepository {

        private static ProductsRepositoryImpl repository = null;
        private Set<Products> products;

        private ProductsRepositoryImpl() {
            this.products = new HashSet<>();
        }

        public static ProductsRepositoryImpl getRepository(){
            if(repository == null) repository = new ProductsRepositoryImpl();
            return repository;
        }

        public Products create(Products products){
            this.products.add(products);
            return products;
        }

        public Products read(String prodType){
            return null;
        }

        public Products update(Products products) {
           return null;
        }

        public void delete(String prodType) {

        }

        public Set<Products> getAll(){
            return this.products;
        }
}
