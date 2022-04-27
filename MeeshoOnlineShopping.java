package com.dlithe.assignment;

import java.util.Objects;

public class MeeshoOnlineShopping {

    private String productName;
    private String productBrand;
    private int productPrice;
    private int productOffer;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(int productOffer) {
        this.productOffer = productOffer;
    }

    @Override
    public String toString() {
        return "MeeshoOnlineShopping{" +
                "productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productPrice=" + productPrice +
                ", productOffer=" + productOffer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MeeshoOnlineShopping)) return false;
        MeeshoOnlineShopping that = (MeeshoOnlineShopping) o;
        return getProductPrice() == that.getProductPrice() && getProductOffer() == that.getProductOffer() && Objects.equals(getProductName(), that.getProductName()) && Objects.equals(getProductBrand(), that.getProductBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductBrand(), getProductPrice(), getProductOffer());
    }
}
