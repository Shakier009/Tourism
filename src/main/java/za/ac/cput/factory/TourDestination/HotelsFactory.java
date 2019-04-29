package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.Hotels;

public class HotelsFactory {

    public static Hotels getHotels(String HotName, String hotLocation) {
        return new Hotels.Builder().
                HotName(HotName).
                hotLocation(hotLocation).
                build();
    }
}