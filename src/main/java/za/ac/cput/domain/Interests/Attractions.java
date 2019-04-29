package za.ac.cput.domain.Interests;



public class Attractions{

    private String attrName, attrCode;

    private Attractions() {
    }

    private Attractions(Attractions.Builder builder) {
        this.attrName = builder.attrName;
        this.attrCode = builder.attrCode;

    }

    public String getAttrName() {

        return attrName;
    }

    public String getAttrCode() {

        return attrCode;

    }

    public static class Builder {

        private String attrName, attrCode;


        public Attractions.Builder attrName(String attrName) {
            this.attrName = attrName;
            return this;
        }

        public Attractions.Builder attrCode(String attrCode) {
            this.attrCode = attrCode;
            return this;
        }


        public Attractions build() {
            return new Attractions(this);
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
