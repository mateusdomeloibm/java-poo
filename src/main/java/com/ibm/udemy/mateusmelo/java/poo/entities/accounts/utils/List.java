package com.ibm.udemy.mateusmelo.java.poo.entities.accounts.utils;

import com.ibm.udemy.mateusmelo.java.poo.entities.accounts.BankAccount;

public class List {
    public static void showAccounts(BankAccount[] accList) {
        System.out.printf("%n===== Accounts List =====%n");
        for (int i = 0; i < accList.length; i++) {
            System.out.printf("   == Account %d ==%n", i);
            System.out.print(accList[i].resume());
        }
    }
}
