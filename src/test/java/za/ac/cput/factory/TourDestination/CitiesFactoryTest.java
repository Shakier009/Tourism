package za.ac.cput.factory.TourDestination;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TourDestination.Cities;


import static org.junit.Assert.*;

public class CitiesFactoryTest {

    @Test
    public void getCities() {

        String cityName = "xxx";
        Cities cit = CitiesFactory.getCities(cityName);


        System.out.println(cit);
        Assert.assertNotNull(cit.getCityName());
    }
}