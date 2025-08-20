package com.enterprise.staff.model;

public class Contact {
	private String emailId;
	private int countryCode;
	private int mobileNumber;
	public Contact(String emailId, int countryCode, int mobileNumber) {
		super();
		this.emailId = emailId;
		this.countryCode = countryCode;
		this.mobileNumber = mobileNumber;
	}
	public Contact() {
		super();
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Contact [emailId=" + emailId + ", countryCode=" + countryCode + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
}
