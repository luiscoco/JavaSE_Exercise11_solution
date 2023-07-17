package com.luxoft.bankapp.exceptions;

public class OverdraftLimitExceededException extends NotEnoughFundsException {
    private double overdraft;

    public OverdraftLimitExceededException(int id, double balance, double amount, double overdraft) {
        super(id, balance, amount);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }
}

