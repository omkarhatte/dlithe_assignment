package com.dlithe.assignment;

import java.util.*;

public class SetEmployeeDetails {

    public static void infoEmpData() {

        TreeSet<EmployeeDetails> empData = new TreeSet<>();
        EmployeeDetails emp = new EmployeeDetails();

        emp.setEmpName("charu");
        emp.setEmpName("runal");
        emp.setEmpName("sharvil");
        emp.setEmpName("smith");
        empData.add(emp);


        EmployeeDetails empAdd = new EmployeeDetails();
        empAdd.setEmpAddress("akurdi");
        empAdd.setEmpAddress("wakad");
        empAdd.setEmpAddress("baner");
        empAdd.setEmpAddress("koregaon park");
        empData.add(empAdd);


        //System.out.println(empData);

        for (EmployeeDetails singleEntry : empData) {
            System.out.println(singleEntry);
        }


    }

    public static void main(String[] args) {
        infoEmpData();
    }
}
