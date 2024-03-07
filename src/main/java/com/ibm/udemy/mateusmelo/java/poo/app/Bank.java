package com.ibm.udemy.mateusmelo.java.poo.app;

import com.ibm.udemy.mateusmelo.java.poo.entities.accounts.BankAccount;
import com.ibm.udemy.mateusmelo.java.poo.entities.accounts.SavingsAccount;
import com.ibm.udemy.mateusmelo.java.poo.entities.accounts.SpecialAccount;
import com.ibm.udemy.mateusmelo.java.poo.entities.accounts.utils.List;

public class Bank {
    public static void main(String[] args) {
        /*
          Example showing each method developed following the content
          of the OOP course regarding Java roadmap
         */
        BankAccount[] bankAccList = new BankAccount[2];

        bankAccList[0] = new SavingsAccount("Mateus", 1001, 15);
        bankAccList[1] = new SpecialAccount("Melo", 1002, 500);
        List.showAccounts(bankAccList);

        System.out.printf("%n****** Update 1: Depositing log ******%n");
        bankAccList[0].deposit(750);
        bankAccList[1].deposit(1500);
        List.showAccounts(bankAccList);

        System.out.printf("%n****** Update 2: Withdrawing log ******%n");
        bankAccList[0].withdraw(800);
        bankAccList[1].withdraw(2000);
        List.showAccounts(bankAccList);

        System.out.printf("%n****** Update 3: Adjusting Savings Account balance value ******%n");
        ((SavingsAccount) bankAccList[0]).calcNewBalance(1);
        List.showAccounts(bankAccList);
    }
}
