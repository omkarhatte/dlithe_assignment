package com.dlithe.assignment;

import java.util.Objects;

public class ResearchAndDevelopment {

    private String empName;
    private int empId;

    @Override
    public String toString() {
        return "ResearchAndDevelopment{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
