package org.jsp.springannotation.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class SBI implements Bank {
	private double balance;

	@Override
	public void balance() {
		System.out.println("Availbale Balance in SBI: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
