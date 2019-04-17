package za.ac.cput.domain.TourDestination;



public class TourDest {

    private String location, arriveDate;

    private TourDest() {
    }

    private TourDest(TourDest.Builder builder) {
        this.location = builder.location;
        this.arriveDate = builder.arriveDate;

    }

    public String getLocation() {
        return location;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public static class Builder {

        private String location, arriveDate;


        public TourDest.Builder location(String location) {
            this.location = location;

            return this;
        }

        public TourDest.Builder arriveDate(String arriveDate) {
            this.arriveDate = arriveDate;
            return this;
        }


        public TourDest build() {
            return new TourDest(this);
        }


    }
}
