package com.javalive.OPPConcepts;

class FixedDepositAccount extends Account {

	private SavingAccount savingAccount;
    
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	@Override
	public String toString() {
		return "FixedDepositAccount [savingAccount=" + savingAccount + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountType()=" + getAccountType() + ", getDateOfOpening()=" + getDateOfOpening()
				+ ", getDateOfCloseing()=" + getDateOfCloseing() + ", getActiveStatus()=" + getActiveStatus()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void depositAmount() {
		System.out.println("This is implementation of depositAmount menthod in FixedDepostAccount class."
				+ "\nBussiness logic goes here.");
		return;
	}

	@Override
	public void withdrawAmount() {
		System.out.println("This is implementation of withdrawAmount menthod in FixedDepostAccount class."
				+ "\nBussiness logic goes here.");
		return;
	}
	
	public void transferInterest() {
		System.out.println("This is transferInterest() method of FixedDepositAccount class."
				+ "\nBussiness logic goes here.");
		return;
	}
	
	public void transferInterest(int accountId) {
		System.out.println("This is overloaded version of transferInterest() method of FixedDepositAccount class."
				+ "\nWith account id as a parameter."
				+ "\nBussiness logic goes here.");
		return ;
	}
}
