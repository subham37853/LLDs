package com.company.patient;

import java.util.HashMap;

public class Patient {
    private final String speciality;
    private final HashMap<Integer, Integer> timing = new HashMap<>();
    private final String day;

    public Patient(String speciality, int from, int to, String day) {
        this.speciality = speciality;
        this.timing.put(from, to);
        this.day = day;
    }

    public String getSpeciality() {
        return speciality;
    }

    public HashMap<Integer, Integer> getTiming() {
        return timing;
    }

    public String getDay() {
        return day;
    }

}
