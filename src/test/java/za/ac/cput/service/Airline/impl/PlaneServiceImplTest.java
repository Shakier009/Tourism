package za.ac.cput.service.Airline.impl;

import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.factory.Airline.PlaneFactory;
import za.ac.cput.service.Airline.impl.PlaneServiceImpl;
import za.ac.cput.repository.impl.Airline.PlaneRepositoryImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PlaneServiceImplTest {

    private PlaneRepositoryImpl repository;
    private Plane plane;

    private Plane getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (PlaneRepositoryImpl) PlaneRepositoryImpl.getRepository();
        this.plane = PlaneFactory.getPlane("Mark3", "xxx7749");
    }

    @Test
    public void AirlineCreate() {
        Plane created = this.repository.create(this.plane);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.plane);
    }

    @Test
    public void AirlineUpdate() {
        String plnecde = "Application Development Theory 3";
        Plane updated = new Plane.Builder().plneCode(plnecde).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(plnecde, updated.getPlneCode());
    }

    @Test
    public void AirlineDelete() {
        Plane saved = getSaved();
        this.repository.delete(saved.getPlneCode());
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
        Set<Plane> airline = this.repository.getAll();
        System.out.println("In getall, all = " + airline);
    }
}