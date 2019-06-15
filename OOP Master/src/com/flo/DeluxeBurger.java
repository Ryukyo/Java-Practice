package com.flo;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", 14.54, "White", "Sausage & Bacon");
        super.addHamburgerAdditionLettuce("Chips", 2.75);
        super.addHamburgerAdditionCheese("Drink", 1.81);
    }

    @Override
    public void addHamburgerAdditionLettuce(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionTomato(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionCheese(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditionCarrot(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
