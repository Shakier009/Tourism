package za.ac.cput.domain.TouristDetails;



public class TouristType {
    private String race;

    private TouristType() {
    }

    private TouristType(TouristType.Builder builder) {
        this.race = builder.race;

    }

    public String getRace() {
        return race;
    }


    public static class Builder {

        private String race;


        public TouristType.Builder race(String race) {
            this.race = race;

            return this;
        }


        public TouristType build() {
            return new TouristType(this);
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
