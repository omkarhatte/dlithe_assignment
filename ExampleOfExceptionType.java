package com.dlithe.assignment;

import com.dlithe.OutOfException;

public class ExampleOfExceptionType {

    public void demo() throws  ArrayIndexOutOfBoundsException{
        int a[] = new int [2];
        a[0]=2;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    public static void main(String[] args) {
        new OutOfException().demo();

    }
}
