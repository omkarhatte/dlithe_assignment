package com.dlithe.assignment;


import Framework.Developer;

import java.util.LinkedList;

public class SetDataForR_D {

    public static void setDepartmentDetails() {

        LinkedList<ResearchAndDevelopment> assistantList = new LinkedList<>();
        ResearchAndDevelopment emp1 = new ResearchAndDevelopment();
        emp1.setEmpId(301);
        emp1.setEmpName("charu");

        assistantList.add(emp1);

        ResearchAndDevelopment emp2 = new ResearchAndDevelopment();
        emp2.setEmpId(302);
        emp2.setEmpName("smith");

        assistantList.add(emp2);

        for (ResearchAndDevelopment singleEntry : assistantList) {
            System.out.println(singleEntry);
        }


    }

    public static void main(String[] args) {
        setDepartmentDetails();
    }
}
