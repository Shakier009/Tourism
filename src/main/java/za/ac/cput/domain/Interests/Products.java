package za.ac.cput.domain.Interests;


public class Products {

    private String prodName, prodType;

    private Products() {
    }

    private Products(Products.Builder builder) {
        this.prodName = builder.prodName;
        this.prodType = builder.prodType;

    }

    public String getProdName() {

        return prodName;
    }

    public String getProdType() {

        return prodType;

    }

    public static class Builder {

        private String prodName, prodType;


        public Products.Builder prodName(String prodName) {
            this.prodName = prodName;
            return this;
        }

        public Products.Builder prodType(String prodType) {
            this.prodType = prodType;
            return this;
        }


        public Products build() {
            return new Products(this);
        }


    }
}
