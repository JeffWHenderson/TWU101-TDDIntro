package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

//        List<String> strings = new ArrayList<String>();
//                StringJoiner joiner = new StringJoiner();
//                String result = joiner.join(strings);
//                assertThat(result, is(""));
public class AccountTests {

    @Test
    public void accountIsInitializedWithBalance(){
        //arrange
        Account account = new Account(100);
        //action
        //assert
        assertThat(account.balance, is(100));
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
