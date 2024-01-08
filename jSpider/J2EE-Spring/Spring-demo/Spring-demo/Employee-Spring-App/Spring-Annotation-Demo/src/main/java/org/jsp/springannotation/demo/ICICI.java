package org.jsp.springannotation.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ICICI implements Bank {
	

	private double balance;;

	@Override
	public void balance() {

		System.out.println("Available Blanace in ICICI " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
