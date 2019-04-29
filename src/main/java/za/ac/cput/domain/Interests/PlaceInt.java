package za.ac.cput.domain.Interests;



public class PlaceInt{

    private String plcName, plcLoc;

    private PlaceInt() {
    }

    private PlaceInt(PlaceInt.Builder builder) {
        this.plcName = builder.plcName;
        this.plcLoc = builder.plcLoc;

    }

    public String getPlcName() {

        return plcName;
    }

    public String getPlcLoc() {

        return plcLoc;

    }

    public static class Builder {

        private String plcName, plcLoc;


        public PlaceInt.Builder plcName(String plcName) {
            this.plcName = plcName;
            return this;
        }

        public PlaceInt.Builder plcLoc(String plcLoc) {
            this.plcLoc = plcLoc;
            return this;
        }


        public PlaceInt build() {
            return new PlaceInt(this);
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
