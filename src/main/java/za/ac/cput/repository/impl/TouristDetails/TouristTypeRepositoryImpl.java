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
            return null;
        }

        public TouristType update(TouristType touristType) {
            return null;
        }

        public void delete(String race) {

        }

        public Set<TouristType> getAll(){
            return this.touristType;
        }
}
