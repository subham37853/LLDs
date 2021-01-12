package com.company.checkAvailibility;

import com.company.Doctors.Doctors;
import com.company.patient.Patient;

import javax.print.Doc;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CheckAvailibility {
    private Patient patient;
    private List<Doctors> doctorsList;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public boolean checkIfAvailable(){
        List<Doctors> doctorsList = this.doctorsList;
        Patient p = this.patient;
        for(Doctors doc : doctorsList){
            if(doc.getTiming().getTiming().equals(patient.getTiming()) &&
                    doc.getTiming().getDays().equals(patient.getDay()) &&
                    doc.getSpeciality().getSpeciality().equals(patient.getSpeciality())){
                return true;
            }
        }
        return false;
    }
}
