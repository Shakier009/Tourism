package za.ac.cput.factory.Interests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.factory.Interests.AttractionsFactory;

import static org.junit.Assert.*;

public class AttractionsFactoryTest {

    @Test
    public void getAttractions() {

        String attrName = "xxx";
        String attrCode ="xxx";
        Attractions att = AttractionsFactory.getAttractions(attrName, attrCode);


        System.out.println(att);
        Assert.assertNotNull(att.getAttrName());
    }

}