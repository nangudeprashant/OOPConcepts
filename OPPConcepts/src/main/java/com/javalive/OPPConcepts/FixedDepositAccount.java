package com.javalive.OPPConcepts;

class FixedDepositAccount extends Account {
	private float rateOfInterest;
	private SavingAccount savingAccount;

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	@Override
	public String toString() {
		return "FixedDepositAccount [rateOfInterest=" + rateOfInterest + ", savingAccount=" + savingAccount
				+ ", getAccountNumber()=" + getAccountNumber() + ", getAccountType()=" + getAccountType()
				+ ", getDateOfOpening()=" + getDateOfOpening() + ", getDateOfCloseing()=" + getDateOfCloseing()
				+ ", getActiveStatus()=" + getActiveStatus() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
