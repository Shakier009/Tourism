package za.ac.cput.domain.Interests;


public class Establishments {

    private String location, estId;

    private Establishments() {
    }

    private Establishments(Establishments.Builder builder) {
        this.location = builder.location;
        this.estId = builder.estId;

    }

    public String getLocation() {

        return location;
    }

    public String getEstId() {

        return estId;

    }

    public static class Builder {

        private String location, estId;


        public Establishments.Builder location(String location) {
            this.location = location;
            return this;
        }

        public Establishments.Builder estId(String estId) {
            this.estId = estId;
            return this;
        }


        public Establishments build() {
            return new Establishments(this);
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
