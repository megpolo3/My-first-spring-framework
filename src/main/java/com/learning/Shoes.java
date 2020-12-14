package com.learning;

public class Shoes {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public Shoes(String brand) {
        this.brand = brand;
    }

    private String brand;

}
