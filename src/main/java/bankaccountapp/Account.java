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
        index++;
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        this.accountNumber = setAccountNumber();
        // Set account number
        setRate();
        System.out.println(getBaseRate());
    }

    public abstract void setRate();

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

    public double compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
        return balance;
    }
    // List the common methods

    public double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
        return balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withrawing $" + amount);
        printBalance();
        return balance;
    }

    public double transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
        return balance;
    }

    public String printBalance() {
        String myBal = "Your balance is now: $" + balance;
        System.out.println(myBal);
        return myBal;
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
                );
    }

}
