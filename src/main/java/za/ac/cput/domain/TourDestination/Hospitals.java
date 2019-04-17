package za.ac.cput.domain.TourDestination;



public class Hospitals{

    private String hospName, hospCode, hospArea;

    private Hospitals() {
    }

    private Hospitals(Hospitals.Builder builder) {
        this.hospName = builder.hospName;
        this.hospCode = builder.hospCode;
        this.hospArea = builder.hospArea;

    }

    public String getHospName() {

        return hospName;
    }

    public String getHospCode() {

        return hospCode;

    }

    public String getHospArea() {

        return hospArea;

    }

    public static class Builder {

        private String hospName, hospCode, hospArea;


        public Hospitals.Builder hospName(String hospName) {
            this.hospName = hospName;
            return this;
        }

        public Hospitals.Builder hospCode(String hospCode) {
            this.hospCode = hospCode;
            return this;
        }

        public Hospitals.Builder hospArea(String hospArea) {
            this.hospArea = hospArea;
            return this;
        }


        public Hospitals build() {
            return new Hospitals(this);
        }


    }
}
