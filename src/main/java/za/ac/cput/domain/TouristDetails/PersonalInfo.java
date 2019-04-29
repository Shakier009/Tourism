package za.ac.cput.domain.TouristDetails;



public class PersonalInfo{

    private String birthPlce;
private int age;
    private PersonalInfo() {
    }

    private PersonalInfo(PersonalInfo.Builder builder) {
        this.age = builder.age;
        this.birthPlce = builder.birthPlce;

    }

    public int getAge() {
        return age;
    }

    public String getBirthPlce() {
        return birthPlce;
    }

    public static class Builder {

        private String  birthPlce;
        private int age;


        public PersonalInfo.Builder age(int age) {
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

     /*@Override
    public String toString() {
        return "Tourist{" +

                ", tourName='" + tourName + '\'' +
                ", tourSurname='" + tourSurname + '\'' +
                ", age=" + age +
                '}';
    }*/
}
