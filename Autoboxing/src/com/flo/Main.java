package com.flo;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank ("Deutsche Bank");
	    bank.addBranch("Munich");
	    bank.addCustomer("Munich","Flo", 50.05);
        bank.addCustomer("Munich","Daniel", 175.34);
        bank.addCustomer("Munich","Lisa", 220.12);

        bank.addBranch("Frankfurt");
        bank.addCustomer("Frankfurt","Robert", 150.54);

        bank.addCustomerTransaction("Munich", "Flo", 42.22);
        bank.addCustomerTransaction("Munich", "Flo", 12.44);
        bank.addCustomerTransaction("Munich", "Lisa", 1.65);

        bank.listCustomers("Munich",true);
        bank.listCustomers("Frankfurt",true);

        if(!bank.addCustomer("Berlin","Olaf",5.53)) {
            System.out.println("Error: Berlin branch  does not exist");
        }
    }
}
