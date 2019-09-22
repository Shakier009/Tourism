package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.factory.Airline.BookingFactory;
import za.ac.cput.service.Airline.impl.BookingServiceImpl;
import za.ac.cput.repository.impl.Airline.BookingRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class BookingServiceImplTest {

    private BookingRepositoryImpl repository;
    private Booking booking;

    private Booking getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (BookingRepositoryImpl) BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking("10:00", "ff4", "Cape Town", "gh444", 9);
    }

    @Test
    public void AirlineCreate() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void AirlineUpdate() {
        String All = "Cape Town";
        Booking updated = new Booking.Builder().destination(All).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(All, updated.getDestination());
    }

    @Test
    public void AirlineDelete() {
        Booking saved = getSaved();
        this.repository.delete(saved.getDestination());
        d_getAll();
    }

//    @Test
//    public void AirlineRead() {
//        Airline saved = getSaved();
//        Airline read = this.repository.read(saved.getTicketNr());
//        System.out.println("In read, read = "+ read);
//        Assert.assertSame(read, saved);
//    }

    @Test
    public void d_getAll() {
        Set<Booking> airline = this.repository.getAll();
        System.out.println("In getall, all = " + airline);
    }
}