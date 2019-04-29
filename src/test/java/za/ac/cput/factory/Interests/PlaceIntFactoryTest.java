package za.ac.cput.factory.Interests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Interests.PlaceInt;

import static org.junit.Assert.*;

public class PlaceIntFactoryTest {

    @Test
    public void getPlaceInt() {

        String plcName = "xxx";
        String plcLoc ="xxx";
        PlaceInt pli = PlaceIntFactory.getPlaceInt(plcName, plcLoc);


        System.out.println(pli);
        Assert.assertNotNull(pli.getPlcName());
    }
}