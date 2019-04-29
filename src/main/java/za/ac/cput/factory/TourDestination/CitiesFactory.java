package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.Cities;

public class CitiesFactory {

    public static Cities getCities(String cityName) {
        return new Cities.Builder().
                cityName(cityName).
                build();
    }
}
