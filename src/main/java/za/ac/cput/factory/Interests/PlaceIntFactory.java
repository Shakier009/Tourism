package za.ac.cput.factory.Interests;

import za.ac.cput.domain.Interests.PlaceInt;

public class PlaceIntFactory {

    public static PlaceInt getPlaceInt(String plcName, String plcLoc) {
        return new PlaceInt.Builder().
                plcName(plcName).
                plcLoc(plcLoc).

                build();
    }
}