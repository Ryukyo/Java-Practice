package com.flo;

public class Hamburger {

    private String name;
    private double price;
    private String breadRollType;
    private String meat;

    private String additionLettuce;
    private double additionLettucePrice;

    private String additionTomato;
    private double additionTomatoPrice;

    private String additionCheese;
    private double additionCheesePrice;

    private String additionCarrot;
    private double additionCarrotPrice;

    public Hamburger(String name, double price, String breadRollType, String meat) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public void addHamburgerAdditionLettuce(String name, double price) {
        this.additionLettuce = name;
        this.additionLettucePrice = price;
    }

    public void addHamburgerAdditionTomato(String name, double price) {
        this.additionTomato = name;
        this.additionTomatoPrice = price;
    }
    public void addHamburgerAdditionCheese(String name, double price) {
        this.additionCheese = name;
        this.additionCheesePrice = price;
    }
    public void addHamburgerAdditionCarrot(String name, double price) {
        this.additionCarrot = name;
        this.additionCarrotPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrize = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is " + this.price);
        if ( this.additionLettuce != null) {
            hamburgerPrize += this.additionLettucePrice;
            System.out.println("Added " + this.additionLettuce + " for an extra " + this.additionLettucePrice);
        }
        if ( this.additionTomato != null) {
            hamburgerPrize += this.additionTomatoPrice;
            System.out.println("Added " + this.additionTomato + " for an extra " + this.additionTomatoPrice);
        }
        if ( this.additionCheese != null) {
            hamburgerPrize += this.additionCheesePrice;
            System.out.println("Added " + this.additionCheese + " for an extra " + this.additionCheesePrice);
        }
        if ( this.additionCarrot != null) {
            hamburgerPrize += this.additionCarrotPrice;
            System.out.println("Added " + this.additionCarrot + " for an extra " + this.additionCarrotPrice);
        }

        return hamburgerPrize;
    }

}
