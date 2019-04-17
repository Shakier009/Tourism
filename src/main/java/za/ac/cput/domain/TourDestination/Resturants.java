package za.ac.cput.domain.TourDestination;



public class Resturants{

    private String restName, restBooking;

    private Resturants() {
    }

    private Resturants(Resturants.Builder builder) {
        this.restName = builder.restName;
        this.restBooking = builder.restBooking;


    }

    public String getRestName() {
        return restName;
    }

    public String getRestBooking() {
        return restBooking;
    }

    public static class Builder {

        private String restName, restBooking;


        public Resturants.Builder restName(String restName) {
            this.restName = restName;
            return this;
        }

        public Resturants.Builder restBooking(String restBooking) {
            this.restBooking = restBooking;
            return this;
        }



        public Resturants build() {
            return new Resturants(this);
        }


    }
}
