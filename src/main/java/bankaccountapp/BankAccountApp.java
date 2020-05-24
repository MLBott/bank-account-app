package main.java.bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

        Checking chkacc1 = new Checking("John Smith", "321456879", 1500);
        Savings savacc1 = new Savings("Jose Garcia", "456657897", 2500);

        chkacc1.showInfo();
        System.out.println("****************");
        savacc1.showInfo();



        // Read a CSV File and then create new accounts based on that data
    }

}
