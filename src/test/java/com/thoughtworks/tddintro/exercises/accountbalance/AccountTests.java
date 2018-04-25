package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void accountIsInitializedWithBalance(){
        Account account = new Account(100);

        assertThat(account.getBalance(), is(100));
    }

    @Test
    @Ignore
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
//        //arrange
//        Account account = new Account();
//
//        //action
//        account.deposit(50);
//
//        //assert
//        assertThat(account.getBalance(), is(150));
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
