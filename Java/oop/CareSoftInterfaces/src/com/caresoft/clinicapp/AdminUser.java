package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents=new ArrayList<String>() ;
    
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public AdminUser(Integer id, String ro ) {
		super(id);
		role=ro;
		// TODO Auto-generated constructor stub
	}
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    public boolean assignPin (int pi) {
		if(pi<100000) {
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
			this.authIncident();
			return false;
			
		}
	}
	public ArrayList<String> reportSecurityIncidents(){
		return  securityIncidents;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
		
	
    
    // TO DO: Setters & Getters

}
