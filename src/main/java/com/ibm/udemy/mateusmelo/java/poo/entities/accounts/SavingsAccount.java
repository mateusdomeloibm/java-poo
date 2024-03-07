package com.ibm.udemy.mateusmelo.java.poo.entities.accounts;

public class SavingsAccount extends BankAccount {
    public int incomeDay;

    public SavingsAccount(String client, int accNumber, int incomeDay) {
        super(client, accNumber);
        this.incomeDay = incomeDay;
    }

    public int getIncomeDay() {
        return incomeDay;
    }

    public void setIncomeDay(int incomeDay) {
        this.incomeDay = incomeDay;
    }

    public void calcNewBalance(float taxAmount) {
        if (incomeDay > 15) {
            double newBalance = getBalance() + (getBalance() * (taxAmount / 100));
            setBalance(newBalance);
        } else if (incomeDay >= 10) {
            double newBalance = getBalance() + (getBalance() * (taxAmount / 100) * 0.5);
            setBalance(newBalance);
        } else {
            System.out.println("Account \"" + getAccNumber() + "\" has insufficient time to generate any profit!");
        }
    }
}
