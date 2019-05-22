package za.ac.cput.repository.impl.Airline;

import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.repository.Airline.FlightDetailsRepository;

import java.util.HashSet;
import java.util.Set;



    public class FlightDetailsRepositoryImpl implements FlightDetailsRepository {

        private static FlightDetailsRepositoryImpl repository = null;
        private Set<FlightDetails> flightDetails;

        private FlightDetailsRepositoryImpl() {
            this.flightDetails = new HashSet<>();
        }

        public static FlightDetailsRepository getRepository(){
            if(repository == null) repository = new FlightDetailsRepositoryImpl();
            return repository;
        }

        public FlightDetails create(FlightDetails flightDetails){
            this.flightDetails.add(flightDetails);
            return flightDetails;
        }

        public FlightDetails read(String flightRow){
            return null;
        }

        public FlightDetails update(FlightDetails flightDetails) {
            return null;
        }

        public void delete(String flightRow) {

        }

        public Set<FlightDetails> getAll(){
            return this.flightDetails;
        }
}
