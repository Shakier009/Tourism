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
    private Passenger Passenger;

    private Passenger getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PassengerRepositoryImpl.getRepository();
        this.Passenger = PassengerFactory.buildPassenger("Application Development Practice 3");
    }

    @Test
    public void PassengerCreate() {
        Passenger created = this.repository.create(this.Passenger);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.Passenger);
    }

    @Test
    public void PassengerUpdate() {
        String newCourseName = "Application Development Theory 3";
        Passenger updated = new Passenger.Builder().copy(getSaved()).courseName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getPsngerId());
    }

    @Test
    public void PassengerDelete() {
        Passenger saved = getSaved();
        this.repository.delete(saved.getPsngerId());
        d_getAll();
    }

    @Test
    public void PassengerRead() {
        Passenger saved = getSaved();
        Passenger read = this.repository.read(saved.getPsngerId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Passenger> Passenger = this.repository.getAll();
        System.out.println("In getall, all = " + Passenger);
    }
}