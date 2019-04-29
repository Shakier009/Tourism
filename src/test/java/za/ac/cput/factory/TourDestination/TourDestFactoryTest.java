package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.TourDest;


import static org.junit.Assert.*;

public class TourDestFactoryTest {

    @Test
    public void getTourDest() {

        String location = "xxx";
        String arriveDate ="xxx";
        TourDest tod = TourDestFactory.getTourDest(location, arriveDate);


        System.out.println(tod);
        Assert.assertNotNull(tod.getArriveDate());
    }
}