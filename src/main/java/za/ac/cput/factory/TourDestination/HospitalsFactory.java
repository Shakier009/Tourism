package za.ac.cput.factory.TourDestination;

import za.ac.cput.domain.TourDestination.Hospitals;

public class HospitalsFactory {

    public static Hospitals getHospitals(String hospName, String hospCode, String hospArea) {
        return new Hospitals.Builder().
                hospName(hospName).
                hospCode(hospCode).
                hospArea(hospArea).
                build();
    }
}