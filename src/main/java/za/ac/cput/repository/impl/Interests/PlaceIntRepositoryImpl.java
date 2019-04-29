package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.repository.Interests.PlaceIntRepository;
import za.ac.cput.repository.impl.Airline.AirlineRepositoryImpl;

import java.util.HashSet;
import java.util.Set;


    public class PlaceIntRepositoryImpl implements PlaceIntRepository {

        private static PlaceIntRepositoryImpl repository = null;
        private Set<PlaceInt> placeInt;

        private PlaceIntRepositoryImpl() {
            this.placeInt = new HashSet<>();
        }

        public static PlaceIntRepository getRepository(){
            if(repository == null) repository = new PlaceIntRepositoryImpl();
            return repository;
        }

        public PlaceInt create(PlaceInt placeInt){
            this.placeInt.add(placeInt);
            return placeInt;
        }

        public PlaceInt read(String plcName){
            //find the student in the set and return it if it exist
            return null;
        }

        public PlaceInt update(PlaceInt placeInt) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String plcName) {
            //find the student and delete it if it exists

        }

        public Set<PlaceInt> getAll(){
            return this.placeInt;
        }
}
