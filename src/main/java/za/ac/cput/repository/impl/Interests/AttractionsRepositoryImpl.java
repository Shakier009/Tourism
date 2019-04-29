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
            //find the student in the set and return it if it exist
            return null;
        }

        public Attractions update(Attractions attractions) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String attrName) {
            //find the student and delete it if it exists

        }

        public Set<Attractions> getAll(){
            return this.attractions;
        }
}
