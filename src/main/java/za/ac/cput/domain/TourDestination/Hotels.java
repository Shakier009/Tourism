package za.ac.cput.domain.TourDestination;



public class Hotels{

    private String HotName, hotLocation;

    private Hotels() {
    }

    private Hotels(Hotels.Builder builder) {
        this.HotName = builder.HotName;
        this.hotLocation = builder.hotLocation;

    }

    public String getHotName() {
        return HotName;
    }

    public String getHotLocation() {
        return hotLocation;
    }

    public static class Builder {

        private String HotName, hotLocation;


        public Hotels.Builder HotName(String HotName) {
            this.HotName = HotName;
            return this;
        }

        public Hotels.Builder hotLocation(String hotLocation) {
            this.hotLocation = hotLocation;
            return this;
        }


        public Hotels build() {
            return new Hotels(this);
        }


    }
}
