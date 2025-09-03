package Models;
/*
 Create a BankAccount  class for bank accounts.
account number // Note : must be 16 digits  , balance , currency , bank account type

 */

import Transactions.Transaction;

public abstract class BankAccount implements Transaction {
    private String accountNumber;
    public long balance;
    private String currency;
    private String bankAccountType;
    private String status;


    public BankAccount(String accountNumber, long balance, String currency, String bankAccountType, String status  ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.bankAccountType = bankAccountType;
        this.status = status;



    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() == 16) {
            this.accountNumber = accountNumber;
        }else {
            System.out.println("account number must be 16 digits");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public void deposit(long amount) {
        if (amount > 0) {
             balance += amount;
        }

    }

    public void withdraw(long amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }
    }
    public void transfer(BankAccount toAccount, long amount){
        if(amount > 0 && balance >= amount){
            this.withdraw(amount);
            toAccount.deposit(amount);
        }

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class B extends BankAccount{

    public B(String accountNumber, long balance, String currency, String bankAccountType) {
        super(accountNumber, balance, currency, bankAccountType);
    }

    public static void main(String[] args) {
        B b1 = new B("1111111111111111", 5000, "USD", "Active");
        B b2 = new B("2222222222222222", 1000, "USD", "Active");

        b1.transfer(b2, 1000);
        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());



    }
}
