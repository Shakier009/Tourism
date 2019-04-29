package za.ac.cput.factory.Log_In;

import za.ac.cput.domain.Log_In.LogIn;

public class LogInFactory {
    public static LogIn getLogIn(String userName, String pssword) {
        return new LogIn.Builder().
                userName(userName).
                pssword(pssword).
                build();
    }
}