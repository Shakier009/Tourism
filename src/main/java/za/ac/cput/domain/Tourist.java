package za.ac.cput.domain;

import za.ac.cput.domain.TourDestination.Destination;

import java.util.Set;

public class Tourist {

    private String touristId, tourName, tourSurname;
    private int age;
    private Set<Destination> destinations;

    private Tourist () {}

    private Tourist(Builder builder){
        this.touristId = builder.touristId;
        this.tourName = builder.tourName;
        this.tourSurname = builder.tourSurname;
        this.age = builder.age;
    }

    public String getTouristId() {

        return touristId;
    }
    public String getTourName() {

        return tourName;
    }
    public String getTourSurname() {

        return tourSurname;
    }
    public int getAge() {

        return age;
    }

    public static class Builder {

        private String touristId, tourName, tourSurname;
        private int age;
        private Set<Destination> destinations;


        public Builder touristId( String studentId) {
            this.touristId = touristId;
            return this;
        }

        public Builder tourName( String studentFirstName) {
            this.tourName = tourName;
            return this;
        }

        public Builder tourSurname( String studentLastName) {
            this.tourSurname = tourSurname;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Tourist build() {
            return new Tourist(this);
        }

    }

    @Override
    public String toString() {
        return "Tourist{" +

                ", tourName='" + tourName + '\'' +
                ", tourSurname='" + tourSurname + '\'' +
                ", age=" + age +
                '}';
    }
}
