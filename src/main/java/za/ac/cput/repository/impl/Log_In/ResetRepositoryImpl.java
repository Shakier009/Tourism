package za.ac.cput.repository.impl.Log_In;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.repository.Log_In.ResetRepository;

import java.util.HashSet;
import java.util.Set;

    public class ResetRepositoryImpl implements ResetRepository {

        private static ResetRepositoryImpl repository = null;
        private Set<Reset> reset;

        private ResetRepositoryImpl() {
            this.reset = new HashSet<>();
        }

        public static ResetRepository getRepository(){
            if(repository == null) repository = new ResetRepositoryImpl();
            return repository;
        }

        public Reset create(Reset reset){
            this.reset.add(reset);
            return reset;
        }

        public Reset read(String email){
            //find the student in the set and return it if it exist
            return null;
        }

        public Reset update(Reset reset) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String email) {
            //find the student and delete it if it exists

        }

        public Set<Reset> getAll(){
            return this.reset;
        }
}
