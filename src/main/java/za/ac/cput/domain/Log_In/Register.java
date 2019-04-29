package za.ac.cput.domain.Log_In;



public class Register{

    private String id, userName, email;

    private Register() {
    }

    private Register(Register.Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.email = builder.email;

    }

    public String getId() {

        return id;
    }

    public String getUserName() {

        return userName;

    }

    public String getEmail() {

        return email;

    }

    public static class Builder {

        private String id, userName, email;


        public Register.Builder id(String id) {
            this.id = id;
            return this;
        }

        public Register.Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Register.Builder email(String email) {
            this.email = email;
            return this;
        }


        public Register build() {
            return new Register(this);
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
