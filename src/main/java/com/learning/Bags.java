package com.learning;

public class Bags {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bags{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String happyBean() {
        return "-- Happy Autowire Bean" ;
    }
    private String brand;

}
