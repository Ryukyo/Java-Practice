package com.flo;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String mailAddress;

    public VipPerson(){
        this("Default name", 50000.00, "default@mail.de");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mail.de");
    }

    public VipPerson(String name, double creditLimit, String mailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.mailAddress = mailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getMailAddress() {
        return mailAddress;
    }
}
