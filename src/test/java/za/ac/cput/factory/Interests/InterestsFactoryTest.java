package za.ac.cput.factory.Interests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Interests.Interests;

import static org.junit.Assert.*;

public class InterestsFactoryTest {

    @Test
    public void getInterests() {

        String intrName = "xxx";
        String plceIntr ="xxx";
        Interests inr = InterestsFactory.getInterests(intrName, plceIntr);


        System.out.println(inr);
        Assert.assertNotNull(inr.getPlceIntr());
    }
}