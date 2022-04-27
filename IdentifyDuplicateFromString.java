package com.dlithe.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IdentifyDuplicateFromString {

    public static void getDuplicate() {

        String input = "this is where all the rain water is harvested. So, where exactly is rain water harvested?";

        String[] strArray = input.split(" ");
        List<String> repeatedWords = new ArrayList<>();
        HashSet<String> uniqueWords = new HashSet<>();
        for (String str : strArray) {
            if (!uniqueWords.add(str))
                repeatedWords.add(str);
        }
        System.out.println(repeatedWords);
    }




    public static void main(String[] args) {
        getDuplicate();
    }
}
