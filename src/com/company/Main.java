package com.company;

import com.company.Doctors.Doctors;
import com.company.Speciality.Speciality;
import com.company.availibility.Availibility;
import com.company.checkAvailibility.CheckAvailibility;
import com.company.patient.Patient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] properties = input.split(" ");
        List<Doctors> doctorsList = creationOfDoctors();
        int n = properties.length;
        int from = getTimeForm(properties[n - 2]);
        int to = getTimeTo(properties[n - 2]);
        String day = properties[n - 4];
        //System.out.println(from + " " + to +" " + day);
        Patient patient = new Patient(properties[7], from, to, day);
        CheckAvailibility checkAvailibility = new CheckAvailibility();
        checkAvailibility.setDoctorsList(doctorsList);
        checkAvailibility.setPatient(patient);
        boolean isAvailable = checkAvailibility.checkIfAvailable();
        if(isAvailable){
            System.out.println("Your Appointment has been booked!!");
        }
        else {
            System.out.println("Sorry!! Your Appointment has not booked, try other timing");
        }
    }

    //method to create 5 doctor
    public static List<Doctors> creationOfDoctors(){
        List<Doctors> doctorsList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Doctors doctors1 = new Doctors();
            Availibility availibility = new Availibility(2, 4, "Monday");
            Speciality speciality = new Speciality("Pediatrician");
            doctors1.setSpeciality(speciality);
            doctors1.setTiming(availibility);
            doctorsList.add(doctors1);
        }
        for(int i = 0; i < 2; i++){
            Doctors doctors1 = new Doctors();
            Speciality speciality = new Speciality("EDM");
            Availibility availibility = new Availibility(1, 4, "Wednesdays");
            doctors1.setSpeciality(speciality);
            doctors1.setTiming(availibility);
            doctorsList.add(doctors1);
        }
        return doctorsList;
    }

    public static int getTimeForm(String s){
        return (s.charAt(0)) - '0';
    }
    public static int getTimeTo(String s){
        return (s.charAt(2))-'0';
    }
}
