package com.dlithe.assignment;

import java.util.HashSet;

public class ProductsOfMeesho {

    public static void dataOfProducts(){
        HashSet<MeeshoOnlineShopping> productList = new HashSet<>();
        MeeshoOnlineShopping p1 = new MeeshoOnlineShopping();
        p1.setProductName("iphone_13");
        p1.setProductBrand("apple");
        p1.setProductPrice(85000);
        p1.setProductOffer(10);
        productList.add(p1);

        MeeshoOnlineShopping p2 = new MeeshoOnlineShopping();
        p2.setProductName("laptop");
        p2.setProductBrand("hp");
        p2.setProductPrice(65000);
        p2.setProductOffer(6);
        productList.add(p2);


        for(MeeshoOnlineShopping singleEntry : productList){
            System.out.println(singleEntry);
        }
    }

    public static void main(String[] args) {
        dataOfProducts();
    }
}
