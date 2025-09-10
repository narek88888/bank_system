package Models;

/*

1. Create an Appointment class
       customerName,  service type (Account Opening ,  Loan Consultation,  Card Issue) ,
      preferredTime ,  priority (Lower number means higher priority)

 */

public class Appointment {
    String customerName;
    String preferredTime;

}

enum ServiceType{
    ACCOUNT_OPENING,
    LOAN_CONSULTATION,

}
