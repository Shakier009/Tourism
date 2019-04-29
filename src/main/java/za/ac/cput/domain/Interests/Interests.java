package za.ac.cput.domain.Interests;



public class Interests {

    private String intrName, plceIntr;

    private Interests() {
    }

    private Interests(Interests.Builder builder) {
        this.intrName = builder.intrName;
        this.plceIntr = builder.plceIntr;

    }

    public String getIntrName() {

        return intrName;
    }

    public String getPlceIntr() {

        return plceIntr;

    }

    public static class Builder {

        private String intrName, plceIntr;


        public Interests.Builder intrName(String intrName) {
            this.intrName = intrName;
            return this;
        }

        public Interests.Builder plceIntr(String plceIntr) {
            this.plceIntr = plceIntr;
            return this;
        }


        public Interests build() {
            return new Interests(this);
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
