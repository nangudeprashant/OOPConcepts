package com.javalive.OPPConcepts;

class SavingAccount extends Account {
	private float rateOfInterest;
	private int lockerId;

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getLockerId() {
		return lockerId;
	}

	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}

	@Override
	public String toString() {
		return "SavingAccount [rateOfInterest=" + rateOfInterest + ", lockerId=" + lockerId + "]";
	}

}
