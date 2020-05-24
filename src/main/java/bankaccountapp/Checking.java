package main.java.bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");

    }

    // List any methods specific to the checking account
}
