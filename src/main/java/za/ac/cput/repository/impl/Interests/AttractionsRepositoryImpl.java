package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.repository.Interests.AttractionsRepository;
import za.ac.cput.repository.impl.Interests.AttractionsRepositoryImpl;

import java.util.HashSet;
import java.util.Set;

    public class AttractionsRepositoryImpl implements AttractionsRepository {

        private static AttractionsRepositoryImpl repository = null;
        private Set<Attractions> attractions;

        private AttractionsRepositoryImpl() {
            this.attractions = new HashSet<>();
        }

        public static AttractionsRepository getRepository(){
            if(repository == null) repository = new AttractionsRepositoryImpl();
            return repository;
        }

        public Attractions create(Attractions attractions){
            this.attractions.add(attractions);
            return attractions;
        }

        public Attractions read(String attrName){
           return null;
        }

        public Attractions update(Attractions attractions) {
           return null;
        }

        public void delete(String attrName) {

        }

        public Set<Attractions> getAll(){
            return this.attractions;
        }
}
