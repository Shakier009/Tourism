package za.ac.cput.factory.Airline;

import za.ac.cput.domain.Airline.FlightDetails;

public class FlightDetailsFactory {

    public static FlightDetails getFlightDetails(String flightClss, String flightRow, int flightNr, int flightSeat){
        return new FlightDetails.Builder().
                flightClss(flightClss).
                flightRow(flightRow).
                flightNr(flightNr).
                flightSeat(flightSeat).
                build();
    }


}

