package com.elvis;

/**
 * Created by Elvis on 9/14/2016.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account (){
        this ("5678", 2.50, "default", "default address", "default phone"); // calling other constructor
        System.out.println("default constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void withdrawal (double withdraealAmount){
        if (this.balance - withdraealAmount <=0){
            System.out.println("only " + this.balance +
                    " available. Withdrawal not processed");
        } else {
            this.balance-= withdraealAmount;
            System.out.println("withdrawal of " + withdraealAmount +
                    "processed. Remainning balance = " + this.balance);
        }

    }
    public void deposite (int amount){
        this.balance += amount;
    }
}
