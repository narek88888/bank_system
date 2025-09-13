package transactions;



import models.BankAccount;
import models.CardAccount;

public abstract interface Transaction {
    public default void deposit1(BankAccount account, long amount) {
    }

    public default void deposit2(CardAccount account, long amount) {
    }

    public default void withdraw1(BankAccount account, long amount) {
    }

    public default void transfer1(CardAccount fromAccount, CardAccount toAccount, long amount) {
    }

    public default void transfer2(BankAccount fromAccount, BankAccount toAccount, long amount) {
    }


}