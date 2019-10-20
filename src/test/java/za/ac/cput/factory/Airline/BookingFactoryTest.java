//package za.ac.cput.factory.Airline;
//
//import org.junit.Assert;
//import org.junit.Test;
//import za.ac.cput.domain.Airline.Booking;
//import za.ac.cput.factory.Airline.BookingFactory;
//
//import static org.junit.Assert.*;
//
//public class BookingFactoryTest {
//
//    @Test
//    public void getBooking() {
//
//        String depTime = "xxx";
//        String invoice ="xxx";
//        String destination ="xxx";
//        String bookingId ="xxx";
//        int seatNr = 20;
//        Booking bok = BookingFactory.getBooking(depTime, invoice, destination, bookingId, seatNr);
//
//
//        System.out.println(bok);
//        Assert.assertNotNull(bok.getSeatNr());
//    }
//}