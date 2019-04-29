package za.ac.cput.factory.TouristDetails;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TouristDetails.TouristType;

import static org.junit.Assert.*;

public class TouristTypeFactoryTest {

    @Test
    public void getTouristType() {

        String race = "xxx";
        TouristType fld = TouristTypeFactory.getTouristType(race);


        System.out.println(fld);
        Assert.assertNotNull(fld.getRace());
    }
}