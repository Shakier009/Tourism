package za.ac.cput.repository.impl.Airline;

import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.repository.Airline.PlaneRepository;

import java.util.HashSet;
import java.util.Set;


    public class PlaneRepositoryImpl implements PlaneRepository {

        private static PlaneRepositoryImpl repository = null;
        private Set<Plane> plane;

        private PlaneRepositoryImpl() {
            this.plane = new HashSet<>();
        }

        public static PlaneRepository getRepository(){
            if(repository == null) repository = new PlaneRepositoryImpl();
            return repository;
        }

        public Plane create(Plane plane){
            this.plane.add(plane);
            return plane;
        }

        public Plane read(String plneType){
            return null;
        }

        public Plane update(Plane plane) {
           return null;
        }

        public void delete(String plneType) {

        }

        public Set<Plane> getAll(){
            return this.plane;
        }
}
