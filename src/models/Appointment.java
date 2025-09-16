package models;

/*
1. Create an Appointment class
       customerName,  service type (Account Opening ,  Loan Consultation,  Card Issue) ,
      preferredTime ,  priority (Lower number means higher priority)

 */


import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
   private String customerName;
    private LocalTime preferredTime;
    private ServiceType serviceType;
    private int priority;

    public Appointment(String customerName, LocalTime preferredTime, ServiceType serviceType){
        this.customerName = customerName;
        this.preferredTime = preferredTime;
        this.serviceType = serviceType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if(customerName == null || customerName.isEmpty()){
            throw new IllegalArgumentException("it cannot be null or empty");
        }else {
            this.customerName = customerName;
        }

    }

    public LocalTime getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(LocalTime preferredTime) {
        if(preferredTime == null){
            throw new IllegalArgumentException("it cannot be null");
        }else {
            this.preferredTime = preferredTime;
        }
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        if(serviceType == null){
            throw new IllegalArgumentException();
        }else {
            this.serviceType = serviceType;
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}





