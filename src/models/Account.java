package models;


import exception.InsufficientFundsException;

public class Account {
     private String accountNumber;
    private String currency;
    private long balance;

    public Account(String accountNumber, String currency, int balance){
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) throws InsufficientFundsException {

        if(accountNumber != null && accountNumber.length() == 16 ){
            try{
                Integer.parseInt(accountNumber);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("account number must be number");
            }
        }
        else {
            throw new InsufficientFundsException();
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

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
