package transactions;



import exception.InsufficientFundsException;
import models.BankAccount;
import models.CardAccount;

public abstract interface Transaction {
    public default void deposit1(BankAccount account, long amount) {
    }

    public default void deposit2(CardAccount account, long amount) {
    }

    public default void withdraw1(BankAccount account, long amount) {
    }

    public default  void withdraw2(CardAccount account, long amount) throws InsufficientFundsException {}



    public default void transfer1(BankAccount fromAccount, BankAccount toAccount, long amount) throws InsufficientFundsException {
    }

    public default void transfer2(CardAccount fromAccount, CardAccount toAccount, long amount) throws InsufficientFundsException {
    }
}