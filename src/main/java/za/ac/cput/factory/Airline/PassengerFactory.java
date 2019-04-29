package za.ac.cput.factory.Airline;

import za.ac.cput.domain.Airline.Passenger;

public class PassengerFactory {

    public static Passenger getPassenger(String psnName, String psnSName, String psngerId, int age){
        return new Passenger.Builder().
                psnName(psnName).
                psnSName(psnSName).
                psngerId(psngerId).
                age(age).
                build();
    }
}
