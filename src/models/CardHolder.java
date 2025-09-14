package models;


import java.util.ArrayList;

public class CardHolder {
    private String passportNumber;
    private String fullName;
    private Address address;
    private ArrayList<String> cardList;
    private BankAccount bankAccount;

    public CardHolder(String passportNumber,String fullName, Address address, ArrayList<String> cardList, BankAccount bankAccount ){
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.address = address;
        this.cardList = cardList;
        this.bankAccount = bankAccount;

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

    public ArrayList<String> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<String> cardList) {
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
        if(fullName == null){
            throw new IllegalArgumentException("it must not be null");
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
