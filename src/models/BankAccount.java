package models;


import enums.BankAccountType;


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
        if(currency == null){
            throw new IllegalArgumentException("it cannot be null");
        }else {
            this.currency = currency;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
            if(accountNumber == null || accountNumber.length() != 16){
                throw new IllegalArgumentException("account number must be 16 digits and must not be null");
            }

            for(char i: accountNumber.toCharArray()){
                if (!Character.isDigit(i)){
                    throw new NumberFormatException("account number must be digits");
                }
            }

            this.accountNumber = accountNumber;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
            this.balance = balance;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        if(bankAccountType == null){
            throw new IllegalArgumentException("it cannot be null");
        }else {
            this.bankAccountType = bankAccountType;
        }
    }



    public BankAccountType getStatus() {
        return status;
    }

    public void setStatus(BankAccountType status) {
        if(status == null){
            throw new IllegalArgumentException("it cannot be null");
        }else {
            this.status = status;
        }
    }
}



