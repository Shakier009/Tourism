package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.repository.Interests.PlaceIntRepository;


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
            return null;
        }

        public PlaceInt update(PlaceInt placeInt) {
            return null;
        }

        public void delete(String plcName) {

        }

        public Set<PlaceInt> getAll(){
            return this.placeInt;
        }
}
