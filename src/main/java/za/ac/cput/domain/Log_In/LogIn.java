package za.ac.cput.domain.Log_In;

public class LogIn {
    private String userName, pssword;

    private LogIn() {
    }

    private LogIn(LogIn.Builder builder) {
        this.userName = builder.userName;
        this.pssword = builder.pssword;

    }

    public String getUserName() {
        return userName;
    }

    public String getPssword() {
        return pssword;
    }



    public static class Builder {

        private String userName, pssword;


        public LogIn.Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public LogIn.Builder pssword(String pssword) {
            this.pssword = pssword;
            return this;
        }



        public LogIn build() {
            return new LogIn(this);
        }


    }



}
