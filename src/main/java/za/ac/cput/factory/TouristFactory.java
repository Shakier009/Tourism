package za.ac.cput.factory;

import za.ac.cput.domain.Tourist;


public class TouristFactory {

    public static Tourist getTourist(String tourName, String tourSurnname, int age){
        return new Tourist.Builder().
                tourName(tourName).
                tourSurname(tourSurnname).
                age(age).
                build();
    }
}
