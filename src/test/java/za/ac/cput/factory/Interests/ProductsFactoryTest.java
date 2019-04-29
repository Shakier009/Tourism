package za.ac.cput.factory.Interests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Interests.Products;

import static org.junit.Assert.*;

public class ProductsFactoryTest {

    @Test
    public void getProducts() {

        String prodName = "xxx";
        String prodType ="xxx";
        Products pro = ProductsFactory.getProducts(prodName, prodType);


        System.out.println(pro);
        Assert.assertNotNull(pro.getProdType());
    }
}