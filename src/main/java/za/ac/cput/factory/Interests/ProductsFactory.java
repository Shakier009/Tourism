package za.ac.cput.factory.Interests;

import za.ac.cput.domain.Interests.Products;

public class ProductsFactory {
    public static Products getProducts(String prodName, String prodType) {
        return new Products.Builder().
                prodName(prodName).
                prodType(prodType).
                build();

    }
}