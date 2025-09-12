package Transactions;

/*
1.  Create an AppointmentManager.

viewAllAppointments ~ return all appointments
getNextAppointment ~ get next appointment
scheduleAppointment ~ schedule some appointments


Your Task Flow:
Try to implement

1. Concepts of OOP  ,
2. Custom exceptions ,
3. Abstract class,
4. Interface ,
5. Collection apis
 */

import Models.Appointment;

import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager(ArrayList<Appointment> appointments){
        this.appointments = appointments;
    }

    public ArrayList<Appointment> viewAllAppointments(){

        return appointments ;
    }

    public Appointment getNextAppointment(){
        int highestPriorityIndex = 0;
        int highestPriority = appointments.get(0).getPriority();
        for (int i = 1; i < appointments.size() ; i++) {
            if(highestPriority > appointments.get(i).getPriority()){
                highestPriority = appointments.get(i).getPriority();
            }
        }
    }



}
