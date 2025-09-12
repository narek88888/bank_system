package Models;


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

    public void setAccountNumber(String accountNumber) {

        if(accountNumber.length() == 16){
            this.accountNumber = accountNumber;
        }
        else {
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

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
