package com.intalent.payment.service.model;

public class Appointment {
	
	private String firstName;
	
	private String lastName;
	
	private String memberId;

	private String appointmentTime;

	private String emailId;

	private String phoneNumber;

	private String notes;
	
	public Appointment() {
		super();
	}
	
	public Appointment(String memberId, String emailId, String phoneNumber) {
		super();
		this.memberId = memberId;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public Appointment(String firstName, String lastName, String memberId, String appointmentTime, String emailId,
			String phoneNumber, String notes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.memberId = memberId;
		this.appointmentTime = appointmentTime;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String y) {
		this.firstName = y;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
