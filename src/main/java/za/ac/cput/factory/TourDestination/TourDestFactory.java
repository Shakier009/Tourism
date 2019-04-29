package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.TourDest;

public class TourDestFactory {

    public static TourDest getTourDest(String location, String arriveDate) {
        return new TourDest.Builder().
                location(location).
                arriveDate(arriveDate).
                build();
    }
}