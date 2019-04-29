package za.ac.cput.repository.impl.TourDestination;

import za.ac.cput.domain.TourDestination.Resturants;
import za.ac.cput.repository.TourDestination.ResturantsRepository;

import java.util.HashSet;
import java.util.Set;



    public class ResturantsRepositoryImpl implements ResturantsRepository {

        private static ResturantsRepository repository = null;
        private Set<Resturants> resturants;

        private ResturantsRepositoryImpl() {
            this.resturants = new HashSet<>();
        }

        public static ResturantsRepository getRepository(){
            if(repository == null) repository = new ResturantsRepositoryImpl();
            return repository;
        }

        public Resturants create(Resturants resturants){
            this.resturants.add(resturants);
            return resturants;
        }

        public Resturants read(String restName){
            //find the student in the set and return it if it exist
            return null;
        }

        public Resturants update(Resturants resturants) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String restName) {
            //find the student and delete it if it exists

        }

        public Set<Resturants> getAll(){
            return this.resturants;
        }
}
