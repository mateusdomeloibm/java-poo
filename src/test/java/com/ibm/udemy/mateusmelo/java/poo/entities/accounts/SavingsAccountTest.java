package com.ibm.udemy.mateusmelo.java.poo.entities.accounts;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    private SavingsAccount account;

    @BeforeEach
    void setUp() {
        account = new SavingsAccount("Mateus", 1234, 15);
        account.setBalance(5000);
    }

    @Test
    void testWithdrawShouldHaveSuccess() {
        int expected = 2000;
        account.withdraw(3000);
        assertEquals(expected, account.getBalance());
    }

    @Test
    void testWithdrawShouldFailAndInitialBalanceMustRemain() {
        int expected = 5000;
        this.account.withdraw(6000);
        assertEquals(expected, account.getBalance());
    }

    @Test
    void testDepositShouldHaveSuccess() {
        int expected = 10000;
        account.deposit(5000);
        assertEquals(expected, account.getBalance());
    }

    @Test
    void testCalcNewBalanceHaveSuccessWithFirstCondition() {
        account.setIncomeDay(10);
        float taxAmount = 5;
        double expectedBalance = 5125.00;
        account.calcNewBalance(taxAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }

    @Test
    void testCalcNewBalanceHaveSuccessWithSecondCondition() {
        account.setIncomeDay(16);
        float taxAmount = 5;
        double expectedBalance = 5250.00;
        account.calcNewBalance(taxAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }

    @Test
    void testCalcNewBalanceHaveFailureAndBalanceMustRemain() {
        account.setIncomeDay(8);
        float taxAmount = 5;
        double expectedBalance = 5000.00;
        account.calcNewBalance(taxAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }

    @Test
    void testResumeShouldHaveSuccessAndResumeAccountData() {
        String expectedMsg = "Client: Mateus\nAccount Number: 1234\nBalance: 5000.00\n";
        assertEquals(expectedMsg, account.resume());
    }
}