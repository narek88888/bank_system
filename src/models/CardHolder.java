package models;


import java.util.ArrayList;

public class CardHolder {
    private String passportNumber;
    private String fullName;
    private String address;
    private ArrayList<String> cardList;
    private String bankAccount;

    public CardHolder(String passportNumber,String fullName, String address, ArrayList<String> cardList, String bankAccount ){
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.address = address;
        this.cardList = cardList;
        this.bankAccount = bankAccount;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public ArrayList<String> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<String> cardList) {
        this.cardList = cardList;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

}
