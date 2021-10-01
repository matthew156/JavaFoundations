package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements PHIAdminCompliant, PHICompliantUser {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
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
	@Override
	public boolean assignPin(int pin) {
		if(pin<100000)	
		return false;
		setPin(pin);
		return true;}
	@Override
	public boolean isAuthorized(Integer confirmedAuthID) {
		if(getId().equals(confirmedAuthID)) {
			authIncident();
			return true;}
			return false;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
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
}
