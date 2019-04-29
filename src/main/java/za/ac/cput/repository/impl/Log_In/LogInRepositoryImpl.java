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
            //find the student in the set and return it if it exist
            return null;
        }

        public LogIn update(LogIn logIn) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String userName) {
            //find the student and delete it if it exists

        }

        public Set<LogIn> getAll(){
            return this.logIn;
        }
}
