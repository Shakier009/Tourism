package za.ac.cput.repository.impl.TourDestination;

import za.ac.cput.domain.TourDestination.Hotels;
import za.ac.cput.repository.TourDestination.HotelsRepository;

import java.util.HashSet;
import java.util.Set;


    public class HotelsRepositoryImpl implements HotelsRepository {

        private static HotelsRepository repository = null;
        private Set<Hotels> hotels;

        private HotelsRepositoryImpl() {
            this.hotels = new HashSet<>();
        }

        public static HotelsRepository getRepository(){
            if(repository == null) repository = new HotelsRepositoryImpl();
            return repository;
        }

        public Hotels create(Hotels hotels){
            this.hotels.add(hotels);
            return hotels;
        }

        public Hotels read(String HotName){
            //find the student in the set and return it if it exist
            return null;
        }

        public Hotels update(Hotels hotels) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String HotName) {
            //find the student and delete it if it exists

        }

        public Set<Hotels> getAll(){
            return this.hotels;
        }
}
