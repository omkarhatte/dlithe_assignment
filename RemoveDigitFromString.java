package com.dlithe.assignment;

public class RemoveDigitFromString {

    public static void removeDigit(){

        String thisString =  "Amb2an9i is4 ric0he1st pe2rso7n";

        thisString = thisString.replaceAll("\\d","");
        System.out.println(thisString);


    }

    public static void main(String[] args) {
        removeDigit();
    }
}
