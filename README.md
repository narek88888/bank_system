<img src="https://github.com/user-attachments/assets/579bf6e7-ee6c-4416-b6c1-91bd98d65b5a" alt="Bank of the Future Logo" width="300">




# This is a **Java project** that simulates basic banking operations.  
# It allows you to create accounts, attach cards, perform deposits, withdrawals, and money transfers.

---

## Features

- **Account creation**  
  Each account has a unique number, currency, and initial balance.  
  This allows managing multiple users independently.

- **Card management (VISA, MasterCard, American Express)**  
  Accounts can have different types of cards attached.  
  Each card stores information such as account number, CVV, expiration date, and status (Active, Closed).

- **Deposits and withdrawals**  
  The system allows adding money to an account and withdrawing money.  
  Withdrawals are validated to make sure the account has sufficient funds.

- **Transfers between accounts**  
  Supports transferring money from one account to another.

- **Error handling (`InsufficientFundsException`, `BankTransactionException`)**  
  The system uses custom exceptions to handle errors in a precise way:  
  - `InsufficientFundsException` – thrown when the account balance is not enough for a withdrawal or transfer.  
  - `BankTransactionException` – a more general exception for handling invalid or unexpected banking operations.  

---

## 🛠️ Technologies Used

- **Java 17+**  
  Written with a modern version of Java to ensure up-to-date language features.

- **Object-Oriented Programming (OOP)**  
  Core classes (Account, CardAccount, BankAccount CardHolder, Transaction) are built using OOP principles:  
  - Encapsulation  
  - Inheritance  
  - Polymorphism  

- **Custom Exceptions**  
  Implements multiple custom exception classes for accurate error handling.

---
