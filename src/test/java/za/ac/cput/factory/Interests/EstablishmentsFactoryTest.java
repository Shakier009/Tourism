package za.ac.cput.factory.Interests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Interests.Establishments;

import static org.junit.Assert.*;

public class EstablishmentsFactoryTest {

    @Test
    public void getEstablishments() {

        String location = "xxx";
        String estId ="xxx";
        Establishments est = EstablishmentsFactory.getEstablishments(location, estId);


        System.out.println(est);
        Assert.assertNotNull(est.getLocation());
    }
}