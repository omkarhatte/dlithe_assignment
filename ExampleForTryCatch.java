package com.dlithe.assignment;

import com.dlithe.ExceptionHandling;

public class ExampleForTryCatch {

    public void test(){
        String name = null;
        int lengthOfName = 0;

        try {
            int lengthofname = name.length(); //CALCULATING THE LENGTH OF THE STRING
        }catch (NullPointerException ex){
            System.out.println("exception handled");
        }
        System.out.println("Length of the String is ::: "+lengthOfName);

    }

    public static void main(String[] args) {
        new ExceptionHandling().test();
        //new ExceptionHandling().test1(); ----> StackOverFlowError


    }
}
