package za.ac.cput.domain.TouristDetails;



public class PersonalInfo{

    private String age, birthPlce;

    private PersonalInfo() {
    }

    private PersonalInfo(PersonalInfo.Builder builder) {
        this.age = builder.age;
        this.birthPlce = builder.birthPlce;

    }

    public String getAge() {
        return age;
    }

    public String getBirthPlce() {
        return birthPlce;
    }

    public static class Builder {

        private String age, birthPlce;


        public PersonalInfo.Builder age(String age) {
            this.age = age;

            return this;
        }

        public PersonalInfo.Builder birthPlce(String birthPlce) {
            this.birthPlce = birthPlce;
            return this;
        }


        public PersonalInfo build() {
            return new PersonalInfo(this);
        }


    }
}
