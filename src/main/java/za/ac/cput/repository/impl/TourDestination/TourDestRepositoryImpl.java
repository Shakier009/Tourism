package za.ac.cput.repository.impl.TourDestination;


import za.ac.cput.domain.TourDestination.TourDest;
import za.ac.cput.repository.TourDestination.TourDestRepository;

import java.util.HashSet;
import java.util.Set;

    public class TourDestRepositoryImpl implements TourDestRepository {

        private static TourDestRepository repository = null;
        private Set<TourDest>tourDest;

        private TourDestRepositoryImpl() {
            this.tourDest = new HashSet<>();
        }

        public static TourDestRepository getRepository(){
            if(repository == null) repository = new TourDestRepositoryImpl();
            return repository;
        }

        public TourDest create(TourDest tourDest){
            this.tourDest.add(tourDest);
            return tourDest;
        }

        public TourDest read(String location){
           return null;
        }

        public TourDest update(TourDest tourDest) {
            return null;
        }

        public void delete(String location) {

        }

        public Set<TourDest> getAll(){
            return this.tourDest;
        }
}
