package models;


import enums.BankAccountType;


import transactions.Transaction;

import enums.Currency;

public class BankAccount  {
    private String accountNumber;
    public long balance;
    private Currency currency;
    private BankAccountType bankAccountType;



    public BankAccount(String accountNumber, long balance, Currency currency, BankAccountType bankAccountType){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.bankAccountType = bankAccountType;

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

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        if(bankAccountType == null){
            throw new IllegalArgumentException("it cannot be null");
        }else {
            this.bankAccountType = bankAccountType;
        }
    }


}



