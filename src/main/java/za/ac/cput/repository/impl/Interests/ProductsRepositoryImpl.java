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
            //find the student in the set and return it if it exist
            return null;
        }

        public Products update(Products products) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String prodType) {
            //find the student and delete it if it exists

        }

        public Set<Products> getAll(){
            return this.products;
        }
}
