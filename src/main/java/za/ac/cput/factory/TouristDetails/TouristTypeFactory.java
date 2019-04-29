package za.ac.cput.factory.TouristDetails;

import za.ac.cput.domain.TouristDetails.TouristType;

public class TouristTypeFactory {

    public static TouristType getTouristType(String race) {
        return new TouristType.Builder().
                race(race).

                build();
    }
}
