package za.ac.cput.repository.impl.TourDestination;

import za.ac.cput.domain.TourDestination.Hospitals;
import za.ac.cput.repository.TourDestination.HospitalsRepository;

import java.util.HashSet;
import java.util.Set;


    public class HospitalsRepositoryImpl implements HospitalsRepository {

        private static HospitalsRepository repository = null;
        private Set<Hospitals> hospitals;

        private HospitalsRepositoryImpl() {
            this.hospitals = new HashSet<>();
        }

        public static HospitalsRepository getRepository(){
            if(repository == null) repository = new HospitalsRepositoryImpl();
            return repository;
        }

        public Hospitals create(Hospitals hospitals){
            this.hospitals.add(hospitals);
            return hospitals;
        }

        public Hospitals read(String hospName){
            //find the student in the set and return it if it exist
            return null;
        }

        public Hospitals update(Hospitals hospitals) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String hospName) {
            //find the student and delete it if it exists

        }

        public Set<Hospitals> getAll(){
            return this.hospitals;
        }
}
