package main.java.bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    public String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfsSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10, 3));
        String combinedNum = lastTwoOfsSN + uniqueID + randomNumber;
        if (sSN.length() != 9) {
            combinedNum = "Error Bad SSN Length";
        }
        return combinedNum;
    }


    // List the common methods
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
                );
    }

}
