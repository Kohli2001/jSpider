package org.jsp.springdemo;

public class Gpay {

	private BankAccount bank;
	
	
	public Gpay() {
		
	}

	public Gpay(BankAccount bank) {
		super();
		this.bank = bank;
	}

	public BankAccount getBank() {
		return bank;
	}

	public void setBank(BankAccount bank) {
		this.bank = bank;
	}
	
	
	
}
