package za.ac.cput.factory.Airline;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Airline.Plane;

import za.ac.cput.factory.Airline.PlaneFactory;

import static org.junit.Assert.*;

public class PlaneFactoryTest {

    @Test
    public void getPlane() {

        String plneType = "xxx";
        String plneCode ="xxx";

        Plane pln = PlaneFactory.getPlane(plneType, plneCode);


        System.out.println(pln);
        Assert.assertNotNull(pln.getPlneCode());
    }
}