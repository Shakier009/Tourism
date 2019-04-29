package za.ac.cput.factory.Airline;

import za.ac.cput.domain.Airline.Airline;

public class AirlineFactory {

    public static Airline getAirline(String ticketNr){
        return new Airline.Builder().
                ticketNr(ticketNr).
                build();
    }
}
