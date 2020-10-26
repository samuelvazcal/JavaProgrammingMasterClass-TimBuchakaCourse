package com.samuelvazquez;

public class DeluxeBurger extends BasicHamburger{
    public DeluxeBurger() {
        super("Deluxe","White","Black Angus & Bacon",160.00);
    }

    private String deluxeExtra1NameChips;
    private double deluxeExtra1PriceChips;

    private String deluxeExtra2NameDrink;
    private double deluxeExtra2PriceDrink;

    public void addDeluxeAddition1() {
        this.deluxeExtra1NameChips = "Lays";
        this.deluxeExtra1PriceChips = 15.00;
    }

    public void addDeluxeAddition2() {
        this.deluxeExtra2NameDrink = "Coca Cola";
        this.deluxeExtra2PriceDrink = 16.00;
    }

    @Override
    public double totalPriceHamburger() {
        double hamburgerPrice = super.totalPriceHamburger();
        if(this.deluxeExtra1NameChips != null) {
            hamburgerPrice += this.deluxeExtra1PriceChips;
            System.out.println("Added " + this.deluxeExtra1NameChips + " for an extra " + this.deluxeExtra1PriceChips);
        }
        if(this.deluxeExtra2NameDrink != null) {
            hamburgerPrice += this.deluxeExtra2PriceDrink;
            System.out.println("Added " + this.deluxeExtra2NameDrink + " for an extra " + this.deluxeExtra2PriceDrink);
        }
        return hamburgerPrice;
    }

    @Override
    public void addAdditional1() {
        System.out.println("Invalid operation");
    }

    @Override
    public void addAdditional2() {
        System.out.println("Invalid operation");
    }

    @Override
    public void addAdditional3() {
        System.out.println("Invalid operation");
    }

    @Override
    public void addAdditional4() {
        System.out.println("Invalid operation");
    }
}
