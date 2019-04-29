package za.ac.cput.repository.impl.Airline;

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
            //find the student in the set and return it if it exist
            return null;
        }

        public Booking update(Booking booking) {
            // find the student, update it and return the updated student
            return null;
        }

        public void delete(String depTime) {
            //find the student and delete it if it exists

        }

        public Set<Booking> getAll(){
            return this.booking;
        }

}
