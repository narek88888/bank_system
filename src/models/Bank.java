package models;
import java.util.ArrayList;



public class Bank {
    private String bankName;
    private Address address;
    private ArrayList<CardHolder> cardHolderList;

    public Bank(ArrayList<CardHolder> cardHolderList, String bankName, Address address){
        this.cardHolderList = cardHolderList;
        this.bankName = bankName;
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        if(bankName == null || bankName.isEmpty()){
            throw  new IllegalArgumentException("it cannot be null or empty");
        }
        else {
            this.bankName = bankName;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if(address == null){
            throw new IllegalArgumentException();
        }
        else {
            this.address = address;
        }
    }

    public ArrayList<CardHolder> getCardHolderList() {
        return cardHolderList;
    }

    public void setCardHolderList(ArrayList<CardHolder> cardHolderList) {
        if(cardHolderList == null){
            throw new IllegalArgumentException();
        }else {
            this.cardHolderList = cardHolderList;
        }
    }
}
