package transactions;

import enums.CardStatus;
import exception.InsufficientFundsException;
import models.CardAccount;



public abstract class CardTransaction implements Transaction {
    long newBalance;
    public void deposit2(CardAccount account, long amount){

         if (account.getCardStatus().equals(CardStatus.BLOCKED)){
             System.out.println("you can't deposit, card is blocked");

         } else if ( amount > 0) {
             newBalance = account.getBalance() + amount;
             account.setBalance(newBalance);
         }
         else {
             System.out.println("it must be greater than 0");
         }
     }

     public void withdraw2(CardAccount account, long amount) throws InsufficientFundsException {

         if(account.getCardStatus().equals(CardStatus.BLOCKED)){
             System.out.println("you can't withdraw, card is blocked");
         } else if (account.getBalance() == 0 || amount > account.getBalance()) {
             throw new InsufficientFundsException();
         }
         else if(amount <= 0){
             System.out.println("it must be greater than 0");
         }
         else {
             newBalance = newBalance - amount;
             account.setBalance(newBalance);
         }
    }





     public void transfer2(CardAccount fromAccount, CardAccount toAccount, long amount) throws InsufficientFundsException {
         if(fromAccount.getCardStatus().equals(CardStatus.BLOCKED)  || toAccount.getCardStatus().equals(CardStatus.BLOCKED) ){
             System.out.println("you can't transfer, card is blocked");
         } else if (fromAccount.getBalance() == 0 || amount > fromAccount.getBalance()) {
             throw new InsufficientFundsException();
         } else if (amount < 0) {
             System.out.println("amount must be greater than 0");
             throw new IllegalArgumentException();
         }
         else {
             withdraw2(fromAccount, amount);
             deposit2(toAccount, amount);
         }


     }

}
