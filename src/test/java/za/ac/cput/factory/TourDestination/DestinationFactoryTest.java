package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.Destination;


import static org.junit.Assert.*;

public class DestinationFactoryTest {

    @Test
    public void getDestination() {

        String destType = "xxx";
        String location ="xxx";
        Destination des = DestinationFactory.getDestination(destType, location);


        System.out.println(des);
        Assert.assertNotNull(des.getDestType());
    }
}