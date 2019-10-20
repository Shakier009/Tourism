/*package za.ac.cput.repository.impl.Airline;

import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.repository.Airline.AirlineRepository;
import za.ac.cput.repository.Airline.BookingRepository;

import java.util.HashSet;
import java.util.Set;


    public class BookingRepositoryImpl implements BookingRepository {

        private static BookingRepositoryImpl repository = null;
        private Set<Booking> booking;

        private BookingRepositoryImpl() {
            this.booking = new HashSet<>();
        }

        public static BookingRepository getRepository(){
            if(repository == null) repository = new BookingRepositoryImpl();
            return repository;
        }

        public Booking create(Booking booking){
            this.booking.add(booking);
            return booking;
        }

        public Booking read(String depTime){
          return null;
        }

        public Booking update(Booking booking) {
            return null;
        }

        public void delete(String depTime) {

        }

        public Set<Booking> getAll(){
            return this.booking;
        }

}*/
