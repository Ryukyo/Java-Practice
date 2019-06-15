package com.flo;

public class HealthyBurger extends Hamburger {

    private String additionHealthy1;
    private double additionHealthyPrice1;
    private String additionHealthy2;
    private double additionHealthyPrice2;

    public HealthyBurger(double price, String meat) {
        super("Healthy", price,"Brown Rye", meat);
    }

    public void addHealthAddition1(String name, double price) {
        this.additionHealthy1 = name;
        this.additionHealthyPrice1 = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.additionHealthy2 = name;
        this.additionHealthyPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.additionHealthy1 != null) {
            hamburgerPrice += this.additionHealthyPrice1;
            System.out.println("Added " + this.additionHealthy1 + "for an extra of " + this.additionHealthyPrice1);
        }
        if (this.additionHealthy2 != null) {
            hamburgerPrice += this.additionHealthyPrice2;
            System.out.println("Added " + this.additionHealthy2 + "for an extra of " + this.additionHealthyPrice2);
        }
        return hamburgerPrice;
    }
}
