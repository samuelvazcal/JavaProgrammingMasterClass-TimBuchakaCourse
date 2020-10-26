package com.samuelvazquez;

public class BasicHamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1NameLettuce;
    private double addition1PriceLettuce;

    private String addition2NameTomato;
    private double addition2PriceTomato;

    private String addition3NameOnion;
    private double addition3PriceOnion;

    private String addition4NameOlives;
    private double addition4PriceOlives;

    public BasicHamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditional1() {
        this.addition1NameLettuce = "lettuce";
        this.addition1PriceLettuce = 2.0;
    }

    public void addAdditional2() {
        this.addition2NameTomato = "tomatoes";
        this.addition2PriceTomato = 4.00;
    }

    public void addAdditional3() {
        this.addition3NameOnion = "onions";
        this.addition3PriceOnion = 3.00;
    }

    public void addAdditional4() {
        this.addition4NameOlives = "olives";
        this.addition4PriceOlives = 5.00;
    }

    public double totalPriceHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " on a " + this.breadRollType + " roll, with meat " + this.meat + " is " + this.price);
        if(this.addition1NameLettuce != null) {
            hamburgerPrice += this.addition1PriceLettuce;
            System.out.println("Added " + this.addition1NameLettuce + " for an extra " + this.addition1PriceLettuce);
        }
        if(this.addition2NameTomato != null) {
            hamburgerPrice += this.addition2PriceTomato;
            System.out.println("Added " + this.addition2NameTomato + " for an extra " + this.addition2PriceTomato);
        }
        if(this.addition3NameOnion != null) {
            hamburgerPrice += this.addition3PriceOnion;
            System.out.println("Added " + this.addition3NameOnion + " for an extra " + this.addition3PriceOnion);
        }
        if(this.addition4NameOlives != null) {
            hamburgerPrice += this.addition4PriceOlives;
            System.out.println("Added " + this.addition4NameOlives + " for an extra " + this.addition4PriceOlives);
        }
        return hamburgerPrice;
    }
}
