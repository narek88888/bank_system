package Test;


import enums.BankAccountType;
import enums.CardStatus;
import enums.CardType;
import exception.InsufficientFundsException;
import models.*;

import enums.Currency;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) throws InsufficientFundsException {
        Account account1 = new Account("1111111111111111", Currency.AMD, 50000);
        Account account2 = new Account("5555555555555555", Currency.AMD, 10000);

        Address address1 = new Address("Armenia","Caucasus", "Yerevan","Amiryan","18");
        Address address2 = new Address("USA", "North America", "Los Angeles", "Sunset Boulevard", "54");
        Address address3 = new Address("Armenia", "Caucasus", "Yerevan", "Amiryan", "25");

        Appointment appointment1 = new Appointment("Sargis", LocalTime.of(5,30),ServiceType.LOAN_CONSULTATION);
        Appointment appointment2 = new Appointment("John", LocalTime.of(5,40), ServiceType.ACCOUNT_OPENING);

        ArrayList<CardHolder> cardHolderList = new ArrayList<>();

        ArrayList<CardAccount> cardList1 = new ArrayList<>();
        ArrayList<CardAccount> cardList2 = new ArrayList<>();


        BankAccount bankAccount1 = new BankAccount("3333333333333333", 50000, Currency.AMD, BankAccountType.DEBIT);
        BankAccount bankAccount2 = new BankAccount("5555555555555555", 10000, Currency.AMD, BankAccountType.CREDIT);

        CardHolder cardHolder1 = new CardHolder("44", "Sargis", address1, bankAccount1, cardList1);
        CardHolder cardHolder2 = new CardHolder("99", "John", address2, bankAccount2, cardList2 );

    cardHolderList.add(cardHolder1);
    cardHolderList.add(cardHolder2);



        Bank bank = new Bank(cardHolderList, "Bank of the Future",address3 );

        CardAccount cardAccount1 = new CardAccount("9999999999999999", "321", LocalDate.of(5, 1, 8), CardType.AMERICAN_EXPRESS, 50000, CardStatus.ACTIVE, Currency.AMD);
        CardAccount cardAccount2 = new CardAccount("1234567899987456", "578", LocalDate.of(4, 1, 14 ), CardType.VISA, 10000, CardStatus.ACTIVE, Currency.AMD);
        cardList1.add(cardAccount1);
        cardList2.add(cardAccount2);


        System.out.println(cardAccount1.getBalance());
        System.out.println(cardAccount2.getBalance());

        cardAccount2.withdraw2(cardAccount1, 1000);
        cardAccount2.withdraw2(cardAccount1, 1000);
        System.out.println(cardAccount1.getBalance());
        System.out.println(cardAccount2.getBalance());








    }
}
