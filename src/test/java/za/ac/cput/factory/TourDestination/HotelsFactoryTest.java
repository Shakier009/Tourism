package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.Hotels;


import static org.junit.Assert.*;

public class HotelsFactoryTest {

    @Test
    public void getHotels() {

        String HotName = "xxx";
        String hotLocation ="xxx";
        Hotels hot = HotelsFactory.getHotels(HotName, hotLocation);


        System.out.println(hot);
        Assert.assertNotNull(hot.getHotLocation());
    }
}