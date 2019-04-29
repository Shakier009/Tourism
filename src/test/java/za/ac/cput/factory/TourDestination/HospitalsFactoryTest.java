package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.Hospitals;


import static org.junit.Assert.*;

public class HospitalsFactoryTest {

    @Test
    public void getHospitals() {

        String hospName = "xxx";
        String hospCode ="xxx";
        String hospArea ="xxx";
        Hospitals hos = HospitalsFactory.getHospitals(hospName, hospCode, hospArea);


        System.out.println(hos);
        Assert.assertNotNull(hos.getHospArea());
    }
}