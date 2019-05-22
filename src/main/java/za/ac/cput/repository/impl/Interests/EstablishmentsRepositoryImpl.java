package za.ac.cput.repository.impl.Interests;

import za.ac.cput.domain.Interests.Establishments;
import za.ac.cput.repository.Interests.EstablishmentsRepository;
import za.ac.cput.repository.impl.Interests.EstablishmentsRepositoryImpl;

import java.util.HashSet;
import java.util.Set;


    public class EstablishmentsRepositoryImpl implements EstablishmentsRepository {

        private static EstablishmentsRepositoryImpl repository = null;
        private Set<Establishments> establishments;

        private EstablishmentsRepositoryImpl() {
            this.establishments = new HashSet<>();
        }

        public static EstablishmentsRepository getRepository(){
            if(repository == null) repository = new EstablishmentsRepositoryImpl();
            return repository;
        }

        public Establishments create(Establishments establishments){
            this.establishments.add(establishments);
            return establishments;
        }

        public Establishments read(String location){
            return null;
        }

        public Establishments update(Establishments establishments) {
            return null;
        }

        public void delete(String location) {

        }

        public Set<Establishments> getAll(){
            return this.establishments;
        }

}
