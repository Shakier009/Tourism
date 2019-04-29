package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.Destination;



public class DestinationFactory {

    public static Destination getDestination(String destType, String location) {
        return new Destination.Builder().
                destType(destType).
                location(location).
                build();

    }
}