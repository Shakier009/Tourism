package za.ac.cput.domain.TourDestination;



public class Cities{
    private String cityName;

    private Cities() {
    }

    private Cities(Cities.Builder builder) {
        this.cityName = builder.cityName;

    }

    public String getCityName() {

        return cityName;
    }

    public static class Builder {

        private String cityName;


        public Cities.Builder cityName(String cityName) {
            this.cityName = cityName;
            return this;
        }



        public Cities build() {
            return new Cities(this);
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
