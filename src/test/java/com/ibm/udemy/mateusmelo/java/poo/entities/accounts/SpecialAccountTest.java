package com.ibm.udemy.mateusmelo.java.poo.entities.accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialAccountTest {
    private SpecialAccount account;
    @BeforeEach
    void setUp() {
        account = new SpecialAccount("Mateus", 4321, 250);
        account.setBalance(2000);
    }

    @Test
    void testWithdrawShouldHaveSuccessAndUseAccountLimit() {
        account.withdraw(2100);
        double expectedBalance = -100;
        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void testWithdrawShouldFailureAndBalanceMustRemain() {
        account.withdraw(2300);
        double expectedBalance = 2000;
        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    void testDepositShouldHaveSuccess() {
        account.deposit(3000);
        int expected = 5000;
        assertEquals(expected, account.getBalance());
    }

    @Test
    void testResumeShouldHaveSuccessAndResumeAccountData() {
        String expectedMsg = "Client: Mateus\nAccount Number: 4321\nBalance: 2000.00\n";
        assertEquals(expectedMsg, account.resume());
    }
}