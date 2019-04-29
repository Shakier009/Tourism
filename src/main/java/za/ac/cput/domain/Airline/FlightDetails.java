package za.ac.cput.domain.Airline;



import java.util.Set;

public class FlightDetails{
    private String flightClss, flightRow;
    private int flightNr, flightSeat;
    private Set<Plane> plane;

    private FlightDetails () {}

    private FlightDetails(FlightDetails.Builder builder){
        this.flightClss = builder.flightClss;
        this.flightRow = builder.flightRow;
        this.flightNr = builder.flightNr;
        this.flightSeat = builder.flightSeat;
    }

    public String getFlightClss() {

        return flightClss;
    }
    public String getFlightRow() {

        return flightRow;
    }
    public int getFlightNr() {

        return flightNr;
    }
    public int getFlightSeat() {

        return flightSeat;
    }

    public static class Builder {

        private String flightClss, flightRow;
        private int flightNr, flightSeat;
        private Set<Plane> plane;


        public FlightDetails.Builder flightClss(String flightClss) {
            this.flightClss = flightClss;
            return this;
        }

        public FlightDetails.Builder flightRow(String flightRow) {
            this.flightRow = flightRow;
            return this;
        }

        public FlightDetails.Builder flightNr(int flightNr) {
            this.flightNr = flightNr;
            return this;
        }

        public FlightDetails.Builder flightSeat(int flightSeat) {
            this.flightSeat = flightSeat;
            return this;
        }

        public FlightDetails build() {
            return new FlightDetails(this);
        }

    }

 /*@Override
    public String toString() {
        return "Tourist{" +

                ", tourName='" + tourName + '\'' +
                ", tourSurname='" + tourSurname + '\'' +
                ", age=" + age +
                '}';
    }*/
}
