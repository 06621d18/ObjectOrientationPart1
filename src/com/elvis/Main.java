package com.elvis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account eva = new Account("12345", 0.00, "eva", "myemail@hello.com", "775699544"); // create a class constructor
        eva.deposite(1000);
        eva.withdrawal(100);
    }
}
