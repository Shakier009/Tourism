package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.Interests;
import za.ac.cput.repository.Interests.InterestsRepository;

import java.util.HashSet;
import java.util.Set;

    public class InterestsRepositoryImpl implements InterestsRepository {

        private static InterestsRepositoryImpl repository = null;
        private Set<Interests> interests;

        private InterestsRepositoryImpl() {
            this.interests = new HashSet<>();
        }

        public static InterestsRepository getRepository(){
            if(repository == null) repository = new InterestsRepositoryImpl();
            return repository;
        }

        public Interests create(Interests interests){
            this.interests.add(interests);
            return interests;
        }

        public Interests read(String ticketNr){
            //find the student in the set and return it if it exist
            return null;
        }

        public Interests update(Interests interests) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String ticketNr) {
            //find the student and delete it if it exists

        }

        public Set<Interests> getAll(){
            return this.interests;
        }
}
