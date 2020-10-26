package com.samuelvazquez;

public class Main {
    public static void main(String[] args) {
        BasicHamburger basicHamburger = new BasicHamburger("StandardHamburger","White", "Basic Angus", 120.00);
        double price = basicHamburger.totalPriceHamburger();
        basicHamburger.addAdditional1();
        basicHamburger.addAdditional2();
        basicHamburger.addAdditional3();
        basicHamburger.addAdditional4();
        System.out.println("Total comes to: " + basicHamburger.totalPriceHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy",140);
        healthyBurger.totalPriceHamburger();
        healthyBurger.addHealthAddition1();
        healthyBurger.addHealthAddition2();
        System.out.println("Total comes to: " + healthyBurger.totalPriceHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.totalPriceHamburger();
        deluxeBurger.addAdditional1();
        deluxeBurger.addAdditional4();
        deluxeBurger.addDeluxeAddition1();
        deluxeBurger.addDeluxeAddition2();
        System.out.println("Total comes to: " + deluxeBurger.totalPriceHamburger());
    }
}
