package com.flo;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("basic",3.56,"white","sausage");
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHamburgerAdditionTomato("Tomato",0.27);
	    hamburger.addHamburgerAdditionLettuce("Lettuce", 0.75);
	    hamburger.addHamburgerAdditionCheese("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(5.67,"Bacon");
        healthyBurger.addHamburgerAdditionCarrot("Carrot", 5.43);
        healthyBurger.addHealthAddition1("Egg", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAdditionTomato("Should not do this", 9.99);
        deluxeBurger.itemizeHamburger();
    }
}
