package models;


import enums.BankAccountType;
import enums.CardStatus;
import transactions.BankAccountTransition;
import transactions.Transaction;

import java.util.Currency;

public abstract class BankAccount implements Transaction {
    private String accountNumber;
    public long balance;
    private Currency currency;
    private String bankAccountType;
    private BankAccountType status;


    public BankAccount(String accountNumber, long balance, Currency currency, String bankAccountType, BankAccountType status  ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.bankAccountType = bankAccountType;
        this.status = status;



    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 16) {
            this.accountNumber = accountNumber;
        }else {
            System.out.println("account number must be 16 digits");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance > 0){
            this.balance = balance;
        }
        else {
            throw new IllegalArgumentException("it must be greater than 0");
        }
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }



    public BankAccountType getStatus() {
        return status;
    }

    public void setStatus(BankAccountType status) {
        this.status = status;
    }
}



