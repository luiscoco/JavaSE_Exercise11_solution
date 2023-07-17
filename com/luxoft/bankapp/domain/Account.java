package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws NotEnoughFundsException;
    double getBalance();
    double maximumAmountToWithdraw();
}
