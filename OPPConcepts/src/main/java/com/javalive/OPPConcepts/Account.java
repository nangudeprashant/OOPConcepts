package com.javalive.OPPConcepts;

import java.util.Date;
//This is the example of abstraction where class is declaring methods without body.
// Abstraction is also achieved with the help of interface in Java which is a solution for multiple inheritance.
abstract class Account {
    private int accountNumber;
	private String accountType;
    private Date dateOfOpening;
    private Date dateOfCloseing;
    private String activeStatus;
    private float rateOfInterest;
    public abstract void depositAmount();  //Abstract method.
    public abstract void withdrawAmount(); //Abstract method.
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public Date getDateOfCloseing() {
		return dateOfCloseing;
	}
	public void setDateOfCloseing(Date dateOfCloseing) {
		this.dateOfCloseing = dateOfCloseing;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", dateOfOpening="
				+ dateOfOpening + ", dateOfCloseing=" + dateOfCloseing + ", ActiveStatus=" + activeStatus + "]";
	}   
}
