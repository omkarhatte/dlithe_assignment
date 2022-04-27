package com.dlithe.assignment;

import com.dlithe.CustomException;
import com.dlithe.InvalidPasswordException;

public class PasswordCustomException {

    public void demoException(){
        String password = null;

        if(password != null){
            System.out.println("login");
        } else{
            throw new InvalidPasswordException("password is mandatory");
        }
    }

    public static void main(String[] args) {
        new CustomException().demoException();
    }
}

