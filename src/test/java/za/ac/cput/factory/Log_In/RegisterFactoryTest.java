package za.ac.cput.factory.Log_In;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Log_In.Register;

import static org.junit.Assert.*;

public class RegisterFactoryTest {

    @Test
    public void getRegister() {

        String userName = "xxx";
        String email ="xxx";
        Register reg = RegisterFactory.getRegister(userName, email);


        System.out.println(reg);
        Assert.assertNotNull(reg.getEmail());
    }
}