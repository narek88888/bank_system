package Models;

/*
1. Create an Appointment class
       customerName,  service type (Account Opening ,  Loan Consultation,  Card Issue) ,
      preferredTime ,  priority (Lower number means higher priority)

 */



public class Appointment {
   private String customerName;
    private String preferredTime;
    private ServiceType serviceType;
    private int priority;

    public Appointment(String customerName, String preferredTime, ServiceType serviceType){
        this.customerName = customerName;
        this.preferredTime = preferredTime;
        this.serviceType = serviceType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}



enum ServiceType{
    ACCOUNT_OPENING,
    LOAN_CONSULTATION,
    CARD_ISSUE

}


