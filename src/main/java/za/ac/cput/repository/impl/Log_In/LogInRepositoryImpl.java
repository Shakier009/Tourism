package za.ac.cput.repository.impl.Log_In;


import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.repository.Log_In.LogInRepository;

import java.util.HashSet;
import java.util.Set;


    public class LogInRepositoryImpl implements LogInRepository {

        private static LogInRepositoryImpl repository = null;
        private Set<LogIn> logIn;

        private LogInRepositoryImpl() {
            this.logIn = new HashSet<>();
        }

        public static LogInRepositoryImpl getRepository(){
            if(repository == null) repository = new LogInRepositoryImpl();
            return repository;
        }

        public LogIn create(LogIn logIn){
            this.logIn.add(logIn);
            return logIn;
        }

        public LogIn read(String userName){
            return null;
        }

        public LogIn update(LogIn logIn) {
            return null;
        }

        public void delete(String userName) {

        }

        public Set<LogIn> getAll(){
            return this.logIn;
        }
}
