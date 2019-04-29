package za.ac.cput.factory.Interests;

import za.ac.cput.domain.Interests.Attractions;

public class AttractionsFactory {

    public static Attractions getAttractions(String attrName, String attrCode) {
        return new Attractions.Builder().
                attrName(attrName).
                attrCode(attrCode).
                build();
    }

}