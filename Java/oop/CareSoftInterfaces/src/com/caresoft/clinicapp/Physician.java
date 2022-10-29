package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements  HIPAACompliantUser {
	
	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	

	public boolean assignPin(int pi) {
		if(pi>9999 || pi<1000) {
			return false;
		}
		else {
			pin=pi;
			return true;
		}
		
		
	}
	public boolean accessAuthorized(Integer id) {
		if (this.id==id) {
			return true;
		}
		else {
			return false;
		}
	}
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	protected ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	protected void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	
	
	}
	
    // TO DO: Setters & Getters
    



