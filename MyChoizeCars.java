package com.dlithe.assignment;

import java.util.Objects;

public class MyChoizeCars {

    private String carName;
    private String carType;

    @Override
    public String toString() {
        return "MyChoizeCars{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyChoizeCars)) return false;
        MyChoizeCars that = (MyChoizeCars) o;
        return Objects.equals(getCarName(), that.getCarName()) && Objects.equals(getCarType(), that.getCarType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarName(), getCarType());
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
