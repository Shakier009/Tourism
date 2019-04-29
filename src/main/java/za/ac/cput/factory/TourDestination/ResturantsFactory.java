package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.Resturants;

public class ResturantsFactory {

    public static Resturants getResturants(String restName, String restBooking) {
        return new Resturants.Builder().
                restName(restName).
                restBooking(restBooking).

                build();
    }
}