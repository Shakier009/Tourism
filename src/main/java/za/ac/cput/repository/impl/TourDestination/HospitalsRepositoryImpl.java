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
            return null;
        }

        public Hospitals update(Hospitals hospitals) {
           return null;
        }

        public void delete(String hospName) {

        }

        public Set<Hospitals> getAll(){
            return this.hospitals;
        }
}
