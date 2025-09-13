package models;


import enums.CardStatus;

import enums.CardType;
import transactions.CardTransaction;

import java.time.LocalDate;
import java.util.Currency;

public class CardAccount extends CardTransaction {

    private String accountNumber;
    private String cvv;
    private LocalDate expirationDate;
    private CardType cardType;
    private long balance;
    private CardStatus cardStatus;
    private Currency currency;

    public CardAccount(String accountNumber, String cvv, LocalDate expirationDate, CardType cardType, long balance, CardStatus cardStatus, Currency currency) {
        this.accountNumber = accountNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.balance = balance;
        this.cardStatus = cardStatus;
        this.currency = currency;


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)  {

        if(accountNumber != null && accountNumber.length() == 16 ){
            try{
                Long.parseLong(accountNumber);
                this.accountNumber = accountNumber;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("account number must be numbers");
            }
        }
        else {
            throw new IllegalArgumentException("it must be 16 digits and must not be empty");

        }

    }
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance){
        if(balance > 0){
            this.balance = balance;
        }
        else {
            throw new IllegalArgumentException("it must me greater than 0");
        }

    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        if(cvv != null && cvv.length() == 3 ){
            try {
                Integer.parseInt(cvv);
                this.cvv = cvv;
            } catch (NumberFormatException e1) {
                throw new NumberFormatException("it must be number");
            }

        }
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

}

