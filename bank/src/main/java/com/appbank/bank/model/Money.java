package com.appbank.bank.model;

public class Money {

private double amount;
private String currency;

// constructor vacio
public Money() {
}

// constructor lleno
public Money(double amount, String currency) {
    this.amount = amount;
    this.currency = currency;
}

// getter and assets
public double getAmount() {
    return amount;
}


public void setAmount(double amount) {
    this.amount = amount;
}


public String getCurrency() {
    return currency;
}


public void setCurrency(String currency) {
    this.currency = currency;
}





}


