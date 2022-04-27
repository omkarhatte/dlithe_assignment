package com.dlithe.assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DunzoMenu {

    public static void setFood(){

        LinkedHashSet<DunzoDelivery> foodList = new LinkedHashSet<>();
        DunzoDelivery menu = new DunzoDelivery();
        menu.setFoodMenu("shawarma");
        menu.setFoodPrice(120);
        foodList.add(menu);

        DunzoDelivery menu1 = new DunzoDelivery();
        menu1.setFoodMenu("momos");
        menu1.setFoodPrice(110);
        foodList.add(menu1);

//        DunzoDelivery menu2 = new DunzoDelivery();
//        menu1.setFoodMenu("rolls");
//        menu1.setFoodPrice(100);
//        foodList.add(menu2);


//        DunzoDelivery menu3 = new DunzoDelivery();
//        menu1.setFoodMenu("sandwich");
//        menu1.setFoodPrice(130);
//        foodList.add(menu3);



        for (DunzoDelivery singleEntry : foodList) {
            System.out.println(singleEntry);
        }
    }

    public static void main(String[] args) {
        setFood();
    }
}
