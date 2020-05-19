package main.java.bankaccountapp;

public class Savings extends Account {
    // List properties specific to the savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings account properties
    public Savings(String name) {
        super(name);
        System.out.println("NEW SAVINGS ACCOUNT");

    }

    // List any methods specific to the savings account
}
