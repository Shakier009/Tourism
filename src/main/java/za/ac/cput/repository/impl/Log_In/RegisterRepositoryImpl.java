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
            return null;
        }

        public Register update(Register register) {
           return null;
        }

        public void delete(String userName) {

        }

        public Set<Register> getAll(){
            return this.register;
        }
}
