package Transactions;

/*

1.  Create a Transaction interface.

Deposit ~ add money to balance
Withdraw ~ take money from balance
Transfer ~ send money to another account

 */

import Models.BankAccount;

public abstract interface Transaction  {

    public abstract void deposit(long amount);

    public abstract void withdraw(long amount);
    public abstract void transfer(BankAccount toAccount, long amount);


}
