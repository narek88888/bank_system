package transactions;


import enums.BankAccountType;
import exception.InsufficientFundsException;
import models.BankAccount;

import static enums.BankAccountType.CREDIT;
import static enums.BankAccountType.DEBIT;

public abstract class BankAccountTransition implements Transaction {
    long newBalance;

    @Override
    public void deposit1(BankAccount account, long amount) {
        if(amount <= 0){
            System.out.println("amount can't be more than the balance");
        }else if(account.getStatus().equals(DEBIT)) {
            newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);        }
    }

    @Override
    public void withdraw1(BankAccount account, long amount) {
        if(amount > account.getBalance()){
            System.out.println("amount can't be more than the balance");
        } else if (account.getStatus().equals(CREDIT)) {
            newBalance = account.balance - amount;
            account.setBalance(newBalance);
        }


    }

    @Override
    public void transfer1(BankAccount fromAccount, BankAccount toAccount, long amount) throws InsufficientFundsException {
       if(fromAccount.getBalance() == 0 || amount > fromAccount.getBalance()){
           throw new InsufficientFundsException();
       }else if(amount < 0) {
           System.out.println("amount must be greater than 0");
           throw new IllegalArgumentException();
       }else if (fromAccount.getStatus().equals(DEBIT) && toAccount.getStatus().equals(CREDIT)) {
           withdraw1(fromAccount, amount);
           deposit1(toAccount, amount);
       }else{
           System.out.println("your bank account must be debit and the receiver's account must be Credit");
       }

    }
}
