package za.ac.cput.factory.Log_In;

import za.ac.cput.domain.Log_In.Reset;

public class ResetFactory {
    public static Reset getReset(String email, String userName) {
        return new Reset.Builder().
                email(email).
                userName(userName).
                build();
    }
}