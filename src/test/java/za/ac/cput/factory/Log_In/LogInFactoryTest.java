package za.ac.cput.factory.Log_In;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Log_In.LogIn;


import static org.junit.Assert.*;

public class LogInFactoryTest {

    @Test
    public void getLogIn() {

        String userName = "xxx";
        String pssword ="xxx";
        LogIn li = LogInFactory.getLogIn(userName, pssword);


        System.out.println(li);
        Assert.assertNotNull(li.getPssword());
    }
}