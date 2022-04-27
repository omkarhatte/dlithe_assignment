package com.dlithe.assignment;

import java.util.Objects;

public class DunzoDelivery {

    private String foodMenu;
    private int foodPrice;

    @Override
    public String toString() {
        return "DunzoDelivery{" +
                "foodMenu='" + foodMenu + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DunzoDelivery)) return false;
        DunzoDelivery that = (DunzoDelivery) o;
        return getFoodPrice() == that.getFoodPrice() && Objects.equals(getFoodMenu(), that.getFoodMenu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoodMenu(), getFoodPrice());
    }

    public String getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(String foodMenu) {
        this.foodMenu = foodMenu;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
}
