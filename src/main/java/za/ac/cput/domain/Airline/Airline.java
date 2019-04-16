package za.ac.cput.domain.Airline;

import za.ac.cput.domain.TourDestination.Destination;
import za.ac.cput.domain.Tourist;

import java.util.Set;

public class Airline {
    private String ticketNr;

    //private Set<Tourist> tourist;

    private Airline () {}

    private Airline(Airline.Builder builder){
        this.ticketNr = builder.ticketNr;

    }

    public String getTicketNr() {

        return ticketNr;
    }


    public static class Builder {

        private String ticketNr;

        //private Set<Tourist> tourist;


        public Builder ticketNr(String ticketNr) {
            this.ticketNr = ticketNr;
            return this;
        }


        }

        public Airline build() {
            return new Airline(this);
        }

    }

   /* @Override
    public String toString() {
        return "Tourist{" +

                ", tourName='" + tourName + '\'' +
                ", tourSurname='" + tourSurname + '\'' +
                ", age=" + age +
                '}';
    }*/

