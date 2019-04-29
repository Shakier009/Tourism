package za.ac.cput.factory.Airline;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Airline.Airline;
import za.ac.cput.factory.Airline.AirlineFactory;

import static org.junit.Assert.*;

public class AirlineFactoryTest {

    @Test
    public void getAirline() {

        String ticketNr = "01XC4";
        Airline air = AirlineFactory.getAirline(ticketNr);


        System.out.println(air);
        Assert.assertNotNull(air.getTicketNr());
    }
}