package main.java.bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        if (accountNumber.matches("[0-9]+")) {
            accountNumber = "2" + accountNumber;
            setDebitCard();
        }
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
        System.out.println("CARD: " + this.debitCardNumber);
        System.out.println("PIN: " + this.debitCardPIN);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Checking Account Features" +
                "\n Safety Deposit Box ID: " + debitCardNumber +
                "\n Safety Deposit Box Key: " + debitCardPIN );
    }
}
