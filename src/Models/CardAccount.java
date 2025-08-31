package Models;

/*

3. Create a CardAccount  class for bank cards.

 account number // Note : must be 16 digits   ,  cvv    // Note : must be 3 digits
expiration date, card type, balance, card status , currency
 */

import Transactions.CardTransaction;

public class CardAccount extends CardTransaction {

    private String accountNumber;
    private String cvv;
    private String expirationDate;
    private String cardType;
    private long balance;
    private String cardStatus;
    private String currency;

    public CardAccount(String accountNumber, String cvv, String expirationDate, String cardType, long balance, String cardStatus, String currency){
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
        if (accountNumber.length() == 16) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("account number must be 16 digits");
        }
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        if(cvv.length() == 3) {
            this.cvv = cvv;
        }else{
            System.out.println("cvv must be 3 digits");

        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static void main(String[] args) {
        CardAccount account1 = new CardAccount("5555555555555555", "478", "2028", "Acba", 5000, "Active", "USD");
        CardAccount account2 = new CardAccount("5555555555555557", "479", "2027", "Ameria", 1000, "Active", "USD");

        CardTransaction cardTransaction = new CardTransaction();

        account1.deposit(account1, 5000);
        System.out.println(account1.getBalance());

        account1․transfer(account1, account2, 2000);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

    }

}
