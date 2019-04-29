package za.ac.cput.domain.TourDestination;



public class Destination{

    private String destType, location;

    private Destination() {
    }

    private Destination(Destination.Builder builder) {
        this.destType = builder.destType;
        this.location = builder.location;

    }

    public String getDestType() {
        return destType;
    }

    public String getLocation() {
        return location;
    }

    public static class Builder {

        private String destType, location;


        public Destination.Builder destType(String destType) {
            this.destType = destType;
            return this;
        }

        public Destination.Builder location(String location) {
            this.location = location;
            return this;
        }



        public Destination build() {
            return new Destination(this);
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
