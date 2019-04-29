package za.ac.cput.repository.impl.Log_In;

import za.ac.cput.domain.Log_In.Register;
import za.ac.cput.repository.Log_In.RegisterRepository;


import java.util.HashSet;
import java.util.Set;



    public class RegisterRepositoryImpl implements RegisterRepository {

        private static RegisterRepositoryImpl repository = null;
        private Set<Register> register;

        private RegisterRepositoryImpl() {
            this.register = new HashSet<>();
        }

        public static RegisterRepository getRepository(){
            if(repository == null) repository = new RegisterRepositoryImpl();
            return repository;
        }

        public Register create(Register register){
            this.register.add(register);
            return register;
        }

        public Register read(String userName){
            //find the student in the set and return it if it exist
            return null;
        }

        public Register update(Register register) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String userName) {
            //find the student and delete it if it exists

        }

        public Set<Register> getAll(){
            return this.register;
        }
}
