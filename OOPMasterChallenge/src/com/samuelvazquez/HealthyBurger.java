package com.samuelvazquez;

public class HealthyBurger extends BasicHamburger{

    private String healthyExtra1NamePineapple;
    private double healthyExtra1PricePineaple;

    private String healthyExtra2NameMushroom;
    private double healthyExtra2PriceMushroom;

    public HealthyBurger(String meat, double price) {
        super("Healthy","Brown rye",meat,price);
    }

    public void addHealthAddition1() {
        this.healthyExtra1NamePineapple = "Pineapple";
        this.healthyExtra1PricePineaple = 8.00;
    }

    public void addHealthAddition2() {
        this.healthyExtra2NameMushroom = "Mushroom";
        this.healthyExtra2PriceMushroom = 7.00;
    }

    @Override
    public double totalPriceHamburger() {
        double hamburgerPrice = super.totalPriceHamburger();
        if(this.healthyExtra1NamePineapple != null) {
            hamburgerPrice += this.healthyExtra1PricePineaple;
            System.out.println("Added " + this.healthyExtra1NamePineapple + " for an extra " + this.healthyExtra1PricePineaple);
        }
        if(this.healthyExtra2NameMushroom != null) {
            hamburgerPrice += this.healthyExtra2PriceMushroom;
            System.out.println("Added " + this.healthyExtra2NameMushroom + " for an extra " + this.healthyExtra2PriceMushroom);
        }
        return hamburgerPrice;
    }
}
