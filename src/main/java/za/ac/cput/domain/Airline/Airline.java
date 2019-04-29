package za.ac.cput.domain.Airline;



public class Airline {
    private String ticketNr;

    private Airline () {}

    private Airline(Builder builder){
        this.ticketNr = builder.ticketNr;

    }

    public String getTicketNr() {

        return ticketNr;
    }


    public static class Builder {

        private String ticketNr;


        public Builder ticketNr(String ticketNr) {
            this.ticketNr = ticketNr;
            return this;
        }
        public Airline build() {
            return new Airline(this);
        }
    }

    @Override
    public String toString() {
        return "Airline{" +

                ", ticketNr='" + ticketNr + '\'' +
                '}';
    }

    }

