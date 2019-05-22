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
           return null;
        }

        public Reset update(Reset reset) {
            return null;
        }

        public void delete(String email) {

        }

        public Set<Reset> getAll(){
            return this.reset;
        }
}
