package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.Resturants;


import static org.junit.Assert.*;

public class ResturantsFactoryTest {

    @Test
    public void getResturants() {

        String restName = "xxx";
        String restBooking ="xxx";
        Resturants res = ResturantsFactory.getResturants(restName, restBooking);


        System.out.println(res);
        Assert.assertNotNull(res.getRestBooking());
    }
}