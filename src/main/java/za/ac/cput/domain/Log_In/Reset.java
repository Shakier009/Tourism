package za.ac.cput.domain.Log_In;

public class Reset{

    private String email, userName;

    private Reset() {
    }

    private Reset(Reset.Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;

    }


    public String getUserName() {

        return userName;

    }

    public String getEmail() {

        return email;

    }

    public static class Builder {

        private String userName, email;


        public Reset.Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Reset.Builder email(String email) {
            this.email = email;
            return this;
        }


        public Reset build() {
            return new Reset(this);
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
