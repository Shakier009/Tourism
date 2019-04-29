package za.ac.cput.factory.Airline;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.factory.Airline.FlightDetailsFactory;

import static org.junit.Assert.*;

public class FlightDetailsFactoryTest {

    @Test
    public void getFlightDetails() {

        String flightClss = "xxx";
        String flightRow ="xxx";
        int flightNr = 20;
        int flightSeat = 20;
        FlightDetails fld = FlightDetailsFactory.getFlightDetails(flightClss, flightRow, flightNr, flightSeat);


        System.out.println(fld);
        Assert.assertNotNull(fld.getFlightSeat());
    }
}