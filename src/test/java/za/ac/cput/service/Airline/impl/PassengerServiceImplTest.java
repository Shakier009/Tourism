package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.factory.Airline.PassengerFactory;
import za.ac.cput.service.Airline.impl.PassengerServiceImpl;
import za.ac.cput.repository.impl.Airline.PassengerRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PassengerServiceImplTest {

    private PassengerRepositoryImpl repository;
    private Passenger passenger;

    private Passenger getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (PassengerRepositoryImpl) PassengerRepositoryImpl.getRepository();
        this.passenger = PassengerFactory.getPassenger("Gregory", "Martin", "hgh333", 21);
    }

    @Test
    public void AirlineCreate() {
        Passenger created = this.repository.create(this.passenger);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.passenger);
    }

    @Test
    public void AirlineUpdate() {
        String nme = "Application Development Theory 3";
        Passenger updated = new Passenger.Builder().psnName(nme).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(nme, updated.getPsnName());
    }

    @Test
    public void AirlineDelete() {
        Passenger saved = getSaved();
        this.repository.delete(saved.getPsnName());
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
        Set<Passenger> airline = this.repository.getAll();
        System.out.println("In getall, all = " + airline);
    }
}