package com.caresoft.clinicapp;

import java.util.ArrayList;

public class Patient extends User implements PHICompliantUser  {
    
    private String firstName;
    private String lastName;
    // .. other personal identifying information .. //
    
    Physician primaryCarePhysician;
    ArrayList<Integer> currentPrescriptionsByRX;
    int providerCode;
    int memberNumber;
    PatientRecord medicalHistory;
    
    // TO DO: Constructor

    
    void addChartNotes(String notes) {
        this.medicalHistory.getCharts().add(notes);
    }

	public Patient(String firstName, String lastName, Physician primaryCarePhysician,
			ArrayList<Integer> currentPrescriptionsByRX, int providerCode, int memberNumber,
			PatientRecord medicalHistory) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.primaryCarePhysician = primaryCarePhysician;
		this.currentPrescriptionsByRX = currentPrescriptionsByRX;
		this.providerCode = providerCode;
		this.memberNumber = memberNumber;
		this.medicalHistory = medicalHistory;
	}

	

	
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Physician getPrimaryCarePhysician() {
		return primaryCarePhysician;
	}

	public void setPrimaryCarePhysician(Physician primaryCarePhysician) {
		this.primaryCarePhysician = primaryCarePhysician;
	}

	public ArrayList<Integer> getCurrentPrescriptionsByRX() {
		return currentPrescriptionsByRX;
	}

	public void setCurrentPrescriptionsByRX(ArrayList<Integer> currentPrescriptionsByRX) {
		this.currentPrescriptionsByRX = currentPrescriptionsByRX;
	}

	public int getProviderCode() {
		return providerCode;
	}

	public void setProviderCode(int providerCode) {
		this.providerCode = providerCode;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public PatientRecord getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(PatientRecord medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	@Override
	public boolean assignPin(int pin) {
		if(pin<=9999 && pin>=1000 && pin!=1234 && pin!= 4321){
			setPin(pin);
			return true;}
			return false;
	}

	@Override
	public boolean isAuthorized(Integer confirmedAuthID) {
		if(getId().equals(confirmedAuthID))
			return true;
			return false;
	}
    
    // TO DO: Setters & Getters
}
