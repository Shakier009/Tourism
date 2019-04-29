package za.ac.cput.factory.Log_In;

import za.ac.cput.domain.Log_In.Register;

public class RegisterFactory {
    public static Register getRegister(String userName, String email) {
        return new Register.Builder().
                userName(userName).
                email(email).
                build();
    }
}