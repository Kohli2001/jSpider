package org.jsp.springdemo.primaryattribute;

public class SBI implements Bank {

	private double balance;
	@Override
	public double getBalance() {
		
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
