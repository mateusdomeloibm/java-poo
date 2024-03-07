package com.ibm.udemy.mateusmelo.java.poo.entities.accounts;

public class SpecialAccount extends BankAccount {
    private final float wdLimit;

    public SpecialAccount(String client, int accNumber, float wdLimit) {
        super(client, accNumber);
        this.wdLimit = wdLimit;
    }

    @Override
    public void withdraw(int amount) {
        double newBalance = getBalance() - amount;
        if (newBalance >= -wdLimit) {
            setBalance(newBalance);
        } else {
            System.out.println(
                    "Client \"" + getClient().toUpperCase() +
                    "\" (Acc: \"" + getAccNumber() +
                    "\") doesn't have balance enough or it's exceeding withdraw limit..."
            );
        }
    }
}
