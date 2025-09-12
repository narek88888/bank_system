package Transactions;
import Enums.*;




import Models.BankAccount;

import static Enums.BankAccountType.CREDIT;
import Models.BankAccount.*;
import Models.CardAccount;

public abstract class BankAccountTransition implements Transaction {
    long newBalance;

    @Override
    public void deposit1(BankAccount account, long amount) {
        if(amount <= 0){
            System.out.println("amount can't be more than the balance");
        }else if(account.getStatus().equals("Debit")) {
            newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);        }
    }

    @Override
    public void withdraw1(BankAccount account, long amount) {
        if(amount > account.getBalance()){
            System.out.println("amount can't be more than the balance");
        } else if (account.getStatus().equals("Credit")) {
            newBalance = account.balance - amount;
            account.setBalance(newBalance);
        }


    }

    @Override
    public void transfer2(BankAccount fromAccount, BankAccount toAccount, long amount) {
        if(amount > fromAccount.getBalance()){
            System.out.println("amount can't be more than balance");
        }
        if (fromAccount.getStatus().equals("Debit") && toAccount.getStatus().equals("Credit")) {
            withdraw1(fromAccount, amount);
            deposit1(toAccount, amount);
        }else {
            System.out.println("Debit and Credit are required");
        }
    }
}
