package za.ac.cput.factory.TouristDetails;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.TouristDetails.PersonalInfo;


import static org.junit.Assert.*;

public class PersonalInfoFactoryTest {

    @Test
    public void getPersonalInfo() {

        String birthPlce = "xxx";
        int age = 20;
        PersonalInfo fld = PersonalInfoFactory.getPersonalInfo(birthPlce, age);


        System.out.println(fld);
        Assert.assertNotNull(fld.getAge());
    }
}