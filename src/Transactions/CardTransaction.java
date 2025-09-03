package Transactions;

import Models.BankAccount;
import Models.CardAccount;

/*
Create CardTransaction class, should include methods:
Deposit
Note : You cannot add money if card is blocked

Withdraw
Note :   You can take money if card is blocked or there is not enough balance

Transfer
Note :  Check that cards is not blocked  and there is no enough balance for take

BlockCard (change card status)


 */

public abstract class CardTransaction implements Transaction {
    long newBalance;
    public void deposit2(CardAccount account, long amount){


         if (account.getCardStatus().equals("Blocked")){
             System.out.println("you can't deposit, card is blocked");

         } else if ( amount > 0) {
             newBalance = account.getBalance() + amount;
             account.setBalance(newBalance);

         }
     }

     public void withdraw(CardAccount account, long amount){

         if(account.getCardStatus().equals("Blocked")){
             System.out.println("you can't withdraw, card is blocked");
         }
         else if(amount <= account.getBalance()){
             newBalance = account.getBalance() - amount;
             account.setBalance(newBalance);
         }
     }

     public void transfer(CardAccount fromAccount, CardAccount toAccount, long amount){
         if(fromAccount.getCardStatus().equals("Blocked") || toAccount.getCardStatus().equals("Blocked")){
             System.out.println("you can't transfer, card is blocked");
         } else if (amount > 0 && amount <= fromAccount.getBalance()) {
             withdraw(fromAccount, amount);
             deposit2(toAccount, amount);
         }



     }





}
