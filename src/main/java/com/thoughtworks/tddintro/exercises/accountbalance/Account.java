package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        if(balance >= withdrawAmount)
            balance -= withdrawAmount;
    }
}
