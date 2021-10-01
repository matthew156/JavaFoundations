package com.caresoft.clinicapp;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
public class Physician extends User implements PHICompliantUser, PHIAdminCompliant {
    
    private HashSet<Patient> patients;
    private ArrayList<String> securityIncidents;
    
    // ... you see other existing member variables. ...
    
    // TO DO: Constructor
    public Physician(HashSet<Patient> patients, ArrayList<String> securityIncidents) {
		super();
		this.patients = patients;
		this.securityIncidents = securityIncidents;
	}    

    
    
    public void prescribeRXTo(Patient patient, Integer rxNumber) {
        patient.currentPrescriptionsByRX.add(rxNumber);
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


	public HashSet<Patient> getPatients() {
		return patients;
	}


	public void setPatients(HashSet<Patient> patients) {
		this.patients = patients;
	}


	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}


	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}



	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
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
    
    // TO DO: Setters & Getters
}
