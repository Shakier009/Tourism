package za.ac.cput.factory.Interests;

import za.ac.cput.domain.Interests.Interests;

public class InterestsFactory {

    public static Interests getInterests(String intrName, String plceIntr) {
        return new Interests.Builder().
                intrName(intrName).
                plceIntr(plceIntr).
                build();
    }

}
