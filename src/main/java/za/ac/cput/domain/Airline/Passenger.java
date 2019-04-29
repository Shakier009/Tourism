package za.ac.cput.domain.Airline;


public class Passenger {
    private String psnName, psnSName, psngerId;
    private int age;
    //private Set<Tourist> tourist;

    private Passenger () {}

    private Passenger(Passenger.Builder builder){
        this. psnName= builder.psnName;
        this. psnSName= builder.psnSName;
        this. psngerId= builder.psngerId;
        this. age= builder.age;
    }

    public String getPsnName() {

        return psnName;
    }
    public String getPsnSName() {

        return psnSName;
    }
    public String getPsngerId() {

        return psngerId;
    }
    public int getAge() {

        return age;
    }

    public static class Builder {

        private String psnName, psnSName, psngerId;
        private int age;
        //private Set<Tourist> tourist;


        public Passenger.Builder psnName(String psnName) {
            this.psnName = psnName;
            return this;
        }

        public Passenger.Builder psnSName(String psnSName) {
            this.psnSName = psnSName;
            return this;
        }

        public Passenger.Builder psngerId(String psngerId) {
            this.psngerId = psngerId;
            return this;
        }

        public Passenger.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
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
