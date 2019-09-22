package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.factory.Airline.AirlineFactory;
import za.ac.cput.service.Airline.impl.AirlineServiceImpl;
import za.ac.cput.repository.impl.Airline.AirlineRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AirlineServiceImplTest {

    private AirlineRepositoryImpl repository;
    private Airline airline;

    private Airline getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (AirlineRepositoryImpl) AirlineRepositoryImpl.getRepository();
        this.airline = AirlineFactory.getAirline("Application Development Practice 3");
    }

    @Test
    public void AirlineCreate() {
        Airline created = this.repository.create(this.airline);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.airline);
    }

   @Test
    public void AirlineUpdate() {
        String newTicketNr = "Application Development Theory 3";
        Airline updated = new Airline.Builder().ticketNr(newTicketNr).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newTicketNr, updated.getTicketNr());
    }

    @Test
    public void AirlineDelete() {
        Airline saved = getSaved();
        this.repository.delete(saved.getTicketNr());
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
        Set<Airline> airline = this.repository.getAll();
        System.out.println("In getall, all = " + airline);
    }
}