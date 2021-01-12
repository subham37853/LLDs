package com.company.Doctors;

import com.company.Speciality.Speciality;
import com.company.availibility.Availibility;

public class Doctors {
    private Speciality speciality;
    private Availibility timing;

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Availibility getTiming() {
        return timing;
    }

    public void setTiming(Availibility timing) {
        this.timing = timing;
    }
}
