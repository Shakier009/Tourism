package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.factory.Airline.FlightDetailsFactory;
import za.ac.cput.service.Airline.impl.FlightDetailsServiceImpl;
import za.ac.cput.repository.impl.Airline.FlightDetailsRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlightDetailsServiceImplTest {

    private FlightDetailsRepositoryImpl repository;
    private FlightDetails flightDetails;

    private FlightDetails getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = FlightDetailsRepositoryImpl.getRepository();
        this.flightDetails = FlightDetailsFactory.buildFlightDetails("Application Development Practice 3");
    }

    @Test
    public void FlightDetailsCreate() {
        FlightDetails created = this.repository.create(this.flightDetails);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.flightDetails);
    }

    @Test
    public void FlightDetailsUpdate() {
        String newCourseName = "Application Development Theory 3";
        FlightDetails updated = new FlightDetails.Builder().copy(getSaved()).courseName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getFlightClss());
    }

    @Test
    public void FlightDetailsDelete() {
        FlightDetails saved = getSaved();
        this.repository.delete(saved.getFlightClss());
        d_getAll();
    }

    @Test
    public void FlightDetailsRead() {
        FlightDetails saved = getSaved();
        FlightDetails read = this.repository.read(saved.getFlightClss());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<FlightDetails> flightDetails = this.repository.getAll();
        System.out.println("In getall, all = " + flightDetails);
    }
}