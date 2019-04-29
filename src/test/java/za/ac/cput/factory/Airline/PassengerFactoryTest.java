package za.ac.cput.factory.Airline;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.factory.Airline.PassengerFactory;

import static org.junit.Assert.*;

public class PassengerFactoryTest {

    @Test
    public void getPassenger() {

        String psnName = "xxx";
        String psnSName ="xxx";
        String psngerId ="xxx";
        int age = 25;
        Passenger pas = PassengerFactory.getPassenger(psnName, psnSName, psngerId, age);


        System.out.println(pas);
        Assert.assertNotNull(pas.getAge());
    }
}