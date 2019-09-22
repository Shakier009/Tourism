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
        this.repository = (FlightDetailsRepositoryImpl) FlightDetailsRepositoryImpl.getRepository();
        this.flightDetails = FlightDetailsFactory.getFlightDetails("A3", "7B", 34, 77);
    }

    @Test
    public void AirlineCreate() {
        FlightDetails created = this.repository.create(this.flightDetails);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.flightDetails);
    }

    @Test
    public void AirlineUpdate() {
        String clss = "A3";
        FlightDetails updated = new FlightDetails.Builder().flightClss(clss).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(clss, updated.getFlightClss());
    }

    @Test
    public void AirlineDelete() {
        FlightDetails saved = getSaved();
        this.repository.delete(saved.getFlightClss());
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
        Set<FlightDetails> airline = this.repository.getAll();
        System.out.println("In getall, all = " + airline);
    }
}