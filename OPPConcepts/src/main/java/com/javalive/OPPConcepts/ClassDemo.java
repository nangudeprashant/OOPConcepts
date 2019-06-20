package com.javalive.OPPConcepts;

public class ClassDemo {

	
	public static void main(String[] args) {
		SavingAccount account1=new SavingAccount();
		account1.withdrawAmount();
		account1.depositAmount();
	    System.out.println("============================================================================");			
		CurrentAccount account2 =new CurrentAccount();
		account2.withdrawAmount();
		account2.depositAmount();
		System.out.println("============================================================================");
		FixedDepositAccount account3 =new FixedDepositAccount();
		account3.withdrawAmount();
		account3.depositAmount();
		account3.transferInterest();
		account3.transferInterest(10);
		System.out.println("=============================================================================");
		PrivilagedSavingAccount account4 =new PrivilagedSavingAccount();
		account4.depositAmount();
		account4.withdrawAmount();
		System.out.println("==============================================================================");
	}
}
