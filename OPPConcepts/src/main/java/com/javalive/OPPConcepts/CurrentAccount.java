package com.javalive.OPPConcepts;

class CurrentAccount extends Account {
	private int overDraftLimit;

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountType()=" + getAccountType() + ", getDateOfOpening()=" + getDateOfOpening()
				+ ", getDateOfCloseing()=" + getDateOfCloseing() + ", getActiveStatus()=" + getActiveStatus()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
