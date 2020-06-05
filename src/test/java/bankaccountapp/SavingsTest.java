package bankaccountapp;

import main.java.bankaccountapp.Savings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsTest {

    @Test
    void savingsVsCheckingTest() {
        Savings testOne = new Savings("Kerry Johnson", "588771001", 800);
        assertEquals('1', testOne.accountNumber.charAt(0));
    }

    @Test
    void savingsAcctNumOverLengthTest() {
        Savings testAcct = new Savings("Kerry Johnson", "5887710018", 800);
        assertEquals("Error Bad SSN Length", testAcct.accountNumber);
    }

    @Test
    void savingsAcctNumUnderLengthTest() {
        Savings testAcct = new Savings("Kerry Johnson", "58877100", 800);
        assertEquals("Error Bad SSN Length", testAcct.accountNumber);
    }

    @Test
    void savingsNoAlphanumTest() {
        Savings testAcct = new Savings("Kerry Johnson", "abc7710018", 800);
        assertThrows(
                NumberFormatException.class,
                () -> Integer.parseInt(testAcct.accountNumber));
    }


    @Test
    void showInfo() {
        Savings testOne = new Savings("Kerry Johnson", "588771001", 800);
        assertDoesNotThrow(() -> testOne.showInfo());
    }
}