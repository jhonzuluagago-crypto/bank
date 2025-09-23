package com.appbank.bank.model;

public class SavingAccount extends Account {

    private double InterestRate;

    public SavingAccount(){

        super();
    }


    public SavingAccount (String id, Customer owner, Money balance, double InterestRate){

        super( id, owner, balance);
        this.InterestRate = InterestRate;
    }

@Override
    public void applyInterest(){

     double newBalance = getBalance().getAmount() + (getBalance(). getAmount() *InterestRate);

    getBalance().setAmount(newBalance);

    }


    public double getInteresRate(){

        return InterestRate;

    }

    public void setInteresRate(double InterestRate){this.InterestRate = InterestRate;}

}
