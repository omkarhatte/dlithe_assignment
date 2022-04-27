package com.dlithe.assignment;

import java.util.Objects;

public class EmployeeDetails implements Comparable <EmployeeDetails> {

    private String empName;
    private String empAddress;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDetails)) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return Objects.equals(getEmpName(), that.getEmpName()) && Objects.equals(getEmpAddress(), that.getEmpAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpName(), getEmpAddress());
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }


    @Override
    public int compareTo(EmployeeDetails o) {
        return 0;
    }
}
