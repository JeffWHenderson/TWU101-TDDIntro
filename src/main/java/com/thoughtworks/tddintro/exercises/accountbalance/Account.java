package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }
}
