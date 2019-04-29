package za.ac.cput.repository.impl.TouristDetails;

import za.ac.cput.domain.TouristDetails.TouristType;
import za.ac.cput.repository.TouristDetails.TouristTypeRepository;

import java.util.HashSet;
import java.util.Set;

    public class TouristTypeRepositoryImpl implements TouristTypeRepository {

        private static TouristTypeRepository repository = null;
        private Set<TouristType> touristType;

        private TouristTypeRepositoryImpl() {
            this.touristType = new HashSet<>();
        }

        public static TouristTypeRepository getRepository(){
            if(repository == null) repository = new TouristTypeRepositoryImpl();
            return repository;
        }

        public TouristType create(TouristType touristType){
            this.touristType.add(touristType);
            return touristType;
        }

        public TouristType read(String race){
            //find the student in the set and return it if it exist
            return null;
        }

        public TouristType update(TouristType touristType) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String race) {
            //find the student and delete it if it exists

        }

        public Set<TouristType> getAll(){
            return this.touristType;
        }
}
