package com.flo;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerMail;
    private String customerPhoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address"
                , "default phone");
        System.out.println("Constructor with parameters called");
    }
    public BankAccount(String number, double balance, String customerName, String customerMail,
                       String customerPhoneNumber ){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerMail = customerMail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(int number) {
        number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
