package com.luxoft.bankapp.exceptions;

public class NotEnoughFundsException extends BankException {
    private int id;
    private double balance;
    private double amount;

    public NotEnoughFundsException(int id, double balance, double amount) {
        super("Not enough funds for account " + id + ". Current balance: " + balance + ", requested amount: " + amount);
        this.id = id;
        this.balance = balance;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
