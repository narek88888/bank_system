package Transactions;

/*

1.  Create a Transaction interface.

Deposit ~ add money to balance
Withdraw ~ take money from balance
Transfer ~ send money to another account

 */

import Models.BankAccount;
import Models.CardAccount;

public abstract interface Transaction  {
    public abstract void deposit1(BankAccount account, long amount);
    public abstract void deposit2(CardAccount account, long amount);

    public abstract void withdraw1(BankAccount account, long amount);
    public abstract void withdraw2(CardAccount account, long amount);

    public abstract void transfer1(CardAccount fromAccount ,CardAccount toAccount, long amount);
    public abstract void transfer2(BankAccount fromAccount, BankAccount toAccount, long amount);

}
