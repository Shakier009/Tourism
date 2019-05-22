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
        this.repository = PlaneRepositoryImpl.getRepository();
        this.plane = PlaneFactory.buildPlane("Application Development Practice 3");
    }

    @Test
    public void PlaneCreate() {
        Plane created = this.repository.create(this.plane);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.plane);
    }

    @Test
    public void PlaneUpdate() {
        String newCourseName = "Application Development Theory 3";
        Plane updated = new Plane.Builder().copy(getSaved()).courseName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getPlneCode());
    }

    @Test
    public void PlaneDelete() {
        Plane saved = getSaved();
        this.repository.delete(saved.getPlneCode());
        d_getAll();
    }

    @Test
    public void AirlineRead() {
        Plane saved = getSaved();
        Plane read = this.repository.read(saved.getPlneCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Plane> plane = this.repository.getAll();
        System.out.println("In getall, all = " + plane);
    }
}