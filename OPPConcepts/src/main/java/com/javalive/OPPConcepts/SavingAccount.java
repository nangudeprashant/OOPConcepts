package com.javalive.OPPConcepts;

class SavingAccount extends Account {
	private int lockerId;
	public int getLockerId() {
		return lockerId;
	}

	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}

	@Override
	public String toString() {
		return "SavingAccount lockerId=" + lockerId + "]";
	}

	@Override
	public void depositAmount() {
		System.out.println("This is implementation of depositAmount menthod in SavingAccount class."
				+ "\nBussiness logic goes here.");
		return;
	}

	@Override
	public void withdrawAmount() {
		System.out.println("This is implementation of withdrawAmount menthod in SavingAccount class."
				+ "\nBussiness logic goes here.");
		return;
	}

}
