package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private Account account;

    @Before
    public void setUp() {
        account = new Account(100);
    }

    @Test
    public void accountIsInitializedWithBalance(){
        /*
         *   I feel like this test was necessary to start with because I needed
         *   to initialize an account and it have a balance to begin writing the
         *   Account class. But these test were later covered by other tests.
         *   How do I test the set basic setup without being redundant?
         */
        assertThat(account.getBalance(), is(100));
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        //arrange done by before Action

        //action
        account.deposit(50);

        //assert
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        //action
        account.withdraw(50);

        //assert
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.withdraw(1000);

        assertThat(account.getBalance(), is(100));
    }
}
