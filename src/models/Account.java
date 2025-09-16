package models;




import enums.Currency;

public class Account {
    private String accountNumber;
    private Currency currency;
    private long balance;

    public Account(String accountNumber, Currency currency, int balance){
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

            if(accountNumber == null || accountNumber.length() != 16){
                throw new IllegalArgumentException("account number must be 16 digits and must not be null");
            }

            for(char i: accountNumber.toCharArray()){
                if (!Character.isDigit(i)){
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
            throw new IllegalArgumentException("it cannot be null");
        }
        this.currency = currency;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
