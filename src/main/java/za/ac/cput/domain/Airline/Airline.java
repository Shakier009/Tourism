package za.ac.cput.domain.Airline;



public class Airline {
    private String ticketNr;

    private Airline (Airline airline) {}

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

