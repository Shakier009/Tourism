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
        this.repository = BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.buildBooking("Application Development Practice 3");
    }

    @Test
    public void BookingCreate() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
    }

    @Test
    public void BookingUpdate() {
        String newCourseName = "Application Development Theory 3";
        Booking updated = new Booking.Builder().copy(getSaved()).courseName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getBookingId());
    }

    @Test
    public void BookingDelete() {
        Booking saved = getSaved();
        this.repository.delete(saved.getBookingId());
        d_getAll();
    }

    @Test
    public void BookingRead() {
        Booking saved = getSaved();
        Booking read = this.repository.read(saved.getBookingId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Booking> booking = this.repository.getAll();
        System.out.println("In getall, all = " + booking);
    }
}