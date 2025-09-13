package models;
import java.util.ArrayList;



public class Bank {
    public String bankName;
    public String address;
    private ArrayList<String> cardHolderList;

    public Bank(ArrayList<String> cardHolderList){
        this.cardHolderList = cardHolderList;

    }

    public ArrayList<String> getCardHolderList() {
        return cardHolderList;
    }

    public void setCardHolderList(ArrayList<String> cardHolderList) {
        this.cardHolderList = cardHolderList;
    }
}
