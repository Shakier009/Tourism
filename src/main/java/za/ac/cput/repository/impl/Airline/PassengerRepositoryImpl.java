package za.ac.cput.repository.impl.Airline;

import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.repository.Airline.PassengerRepository;

import java.util.HashSet;
import java.util.Set;


    public class PassengerRepositoryImpl implements PassengerRepository {

        private static PassengerRepositoryImpl repository = null;
        private Set<Passenger> passenger;

        private PassengerRepositoryImpl() {
            this.passenger = new HashSet<>();
        }

        public static PassengerRepository getRepository(){
            if(repository == null) repository = new PassengerRepositoryImpl();
            return repository;
        }

        public Passenger create(Passenger passenger){
            this.passenger.add(passenger);
            return passenger;
        }

        public Passenger read(String psnSName){
           return null;
        }

        public Passenger update(Passenger passenger) {
           return null;
        }

        public void delete(String psnSName) {

        }

        public Set<Passenger> getAll(){
            return this.passenger;
        }
}
