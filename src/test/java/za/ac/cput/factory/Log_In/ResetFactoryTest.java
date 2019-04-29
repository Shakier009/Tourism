package za.ac.cput.factory.Log_In;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Log_In.Reset;

import static org.junit.Assert.*;

public class ResetFactoryTest {

    @Test
    public void getReset() {

        String email = "xxx";
        String userName ="xxx";
        Reset res = ResetFactory.getReset(email, userName);


        System.out.println(res);
        Assert.assertNotNull(res.getEmail());
    }
}