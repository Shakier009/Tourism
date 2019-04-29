package za.ac.cput.factory.Airline;

import za.ac.cput.domain.Airline.Plane;

public class PlaneFactory {

    public static Plane getPlane(String plneType, String plneCode){
        return new Plane.Builder().
                plneType(plneType).
                plneCode(plneCode).
                build();
    }
}
