package bankaccountapp;

import main.java.bankaccountapp.Checking;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingTest {
    @Test
    public void checkingVsSavingsTest() {
        Checking testAcct = new Checking("Kerry Johnson", "588771001", 800);
        assertEquals('2', testAcct.accountNumber.charAt(0));
    }


    @Test
    public void checkingAcctNumOverLengthTest() {
        Checking testAcct = new Checking("Kerry Johnson", "5887710018", 800);
        assertEquals("Error Bad SSN Length", testAcct.accountNumber);
    }

    @Test
    public void checkingAcctNumUnderLengthTest() {
        Checking testAcct = new Checking("Kerry Johnson", "58877100", 800);
        assertEquals("Error Bad SSN Length", testAcct.accountNumber);
    }



    @Test
    public void checkingNoAlphanumTest() {
        Checking testAcct = new Checking("Kerry Johnson", "abc7710018", 800);
        assertThrows(
                NumberFormatException.class,
                () -> Integer.parseInt(testAcct.accountNumber));
    }



    @Test
    void showInfo() {
        Checking testOne = new Checking("Kerry Johnson", "588771001", 800);
        assertDoesNotThrow(() -> testOne.showInfo());
    }
}