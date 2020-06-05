package bankaccountapp;

import main.java.bankaccountapp.Savings;
import main.java.bankaccountapp.Checking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void accountIncrementTest() {
        Savings demoAcct1 = new Savings("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 800);
        Savings demoAcct3 = new Savings("David Watson", "388771001", 800);
        assertEquals("10011", demoAcct1.accountNumber.substring(3, 8));
        assertEquals("10012", demoAcct2.accountNumber.substring(3, 8));
        assertEquals("10013", demoAcct3.accountNumber.substring(3, 8));
    }

    @Test
    public void setRateHiLoTest() {
        double newRate;
        double newRate2;
        double newRate3;
        Savings demoAcct = new Savings("Kerry Johnson", "588771001", 800);
        newRate = demoAcct.getBaseRate() * 50000;
        assertDoesNotThrow(() -> System.out.println(newRate));
        newRate2 = demoAcct.getBaseRate() * 0;
        assertDoesNotThrow(() -> System.out.println(newRate2));
        newRate3 = demoAcct.getBaseRate() * -50000;
        assertDoesNotThrow(() -> System.out.println(newRate3));
    }

    @Test
    public void compoundTest() {
        Checking demoAcct1 = new Checking("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 1000);
        assertEquals(803, demoAcct1.compound());
        assertEquals(1022.5, demoAcct2.compound());
    }

    @Test
    public void depositTest() {
        Checking demoAcct1 = new Checking("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 1000);
        assertEquals(850, demoAcct1.deposit(50));
        assertEquals(2000, demoAcct2.deposit(1000));
    }

    @Test
    public void withdrawTest() {
        Checking demoAcct1 = new Checking("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 1000);
        assertEquals(400, demoAcct1.withdraw(400));
        assertEquals(500, demoAcct2.withdraw(500));

    }

    @Test
    public void transferTest() {
        Checking demoAcct1 = new Checking("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 1000);
        assertEquals(600, demoAcct1.transfer("Hedge Fund", 200));
        assertEquals(950, demoAcct2.transfer("401(k)", 50));
    }

    @Test
    public void printBalanceTest() {
        Checking demoAcct1 = new Checking("Kerry Johnson", "588771001", 800);
        Savings demoAcct2 = new Savings("Bruce Johnson", "488771001", 1000);
        String expectedOutput1 = "Your balance is now: $800.0";
        String expectedOutput2 = "Your balance is now: $1000.0";
        assertEquals(expectedOutput1, demoAcct1.printBalance());
        assertEquals(expectedOutput2, demoAcct2.printBalance());
    }

    @Test
    void showInfo() {
        Savings demoAcct = new Savings("Kerry Johnson", "588771001", 800);
        assertDoesNotThrow(() -> demoAcct.showInfo());

    }
}