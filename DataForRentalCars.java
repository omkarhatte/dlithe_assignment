package com.dlithe.assignment;

import java.util.ArrayList;

public class DataForRentalCars {

    public static void setData(){

        ArrayList<MyChoizeCars> carList = new ArrayList<>();

        MyChoizeCars car1 = new MyChoizeCars();
        car1.setCarName("swift");
        car1.setCarType("hatchback");
        carList.add(car1);


        MyChoizeCars car2 = new MyChoizeCars();
        car2.setCarName("harrier");
        car2.setCarType("suv");
        carList.add(car2);

        System.out.println(carList);
    }

    public static void main(String[] args) {
        setData();
    }
}
