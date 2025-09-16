package models;


import enums.CardType;

import java.util.ArrayList;

public class CardHolder {
    private String passportNumber;
    private String fullName;
    private Address address;
    private ArrayList<CardAccount> cardList;
    private BankAccount bankAccount;

    public CardHolder(String passportNumber,String fullName, Address address,  BankAccount bankAccount,  ArrayList<CardAccount> cardList ){
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.address = address;
        this.bankAccount = bankAccount;
        this.cardList = cardList;
        
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if(address == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else {
            this.address = address;
        }

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        if(bankAccount == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else{
            this.bankAccount = bankAccount;
        }

    }

    public ArrayList<CardAccount> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<CardAccount> cardList) {
        if(cardList == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else {
            this.cardList = cardList;
        }

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("it must not be null or empty");
        }
        else {
            this.fullName = fullName;
        }

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        if(passportNumber == null){
            throw new IllegalArgumentException("it must not be null");
        }
        else {
            this.passportNumber = passportNumber;
        }

    }


}
