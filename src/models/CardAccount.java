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

    public void setAccountNumber(String accountNumber) {


            if (accountNumber == null || accountNumber.length() != 16) {
                throw new IllegalArgumentException("account number must be 16 digits and must not be null");
            }

            for (char i : accountNumber.toCharArray()) {
                if (!Character.isDigit(i)) {
                    throw new NumberFormatException("account number must be digits");
                }
            }

            this.accountNumber = accountNumber;



    }
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        if(currency == null){
            throw new IllegalArgumentException("it must not be null");
        }else {
            this.currency = currency;
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance){
        this.balance = balance;

    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        if(cardStatus == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else {
            this.cardStatus = cardStatus;
        }
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        if(cardType == null){
            throw new IllegalArgumentException("it must not be null");
        }else {
            this.cardType = cardType;
        }
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {

        if(cvv == null || cvv.length() != 3){
            throw new IllegalArgumentException("account number must be 16 digits and must not be null");
        }

        for(char i: cvv.toCharArray()){
            if (!Character.isDigit(i)){
                throw new NumberFormatException("account number must be digits");
            }
        }

        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if(expirationDate == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else {
            this.expirationDate = expirationDate;
        }
    }

}

