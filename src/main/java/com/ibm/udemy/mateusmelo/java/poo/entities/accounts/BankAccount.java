package com.ibm.udemy.mateusmelo.java.poo.entities.accounts;

import java.text.Format;

public abstract class BankAccount {
    private String client;
    private int accNumber;
    private double balance;

    public BankAccount(String client, int accNumber) {
        this.client = client;
        this.accNumber = accNumber;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println(
                    "Client \"" + client.toUpperCase() +
                    "\" (Acc: \"" + accNumber +
                    "\") has no balance enough..."
            );

            return;
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String resume() {
        return String.format(
                "Client: %s%nAccount Number: %d%nBalance: %.2f%n",
                client,
                accNumber,
                balance
        );
    }
}
