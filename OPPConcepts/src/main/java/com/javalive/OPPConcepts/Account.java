package com.javalive.OPPConcepts;

import java.util.Date;

class Account {
    private int accountNumber;
	private String accountType;
    private Date dateOfOpening;
    private Date dateOfCloseing;
    private String ActiveStatus;
    
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
		return ActiveStatus;
	}
	public void setActiveStatus(String activeStatus) {
		ActiveStatus = activeStatus;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", dateOfOpening="
				+ dateOfOpening + ", dateOfCloseing=" + dateOfCloseing + ", ActiveStatus=" + ActiveStatus + "]";
	}   
}
