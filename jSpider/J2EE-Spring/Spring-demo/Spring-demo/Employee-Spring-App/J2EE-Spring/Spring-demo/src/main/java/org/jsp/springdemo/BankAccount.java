package org.jsp.springdemo;

public class BankAccount {

	
	private String name;
	private double balance;
	
	public void balance() {
		System.out.println("Hello: "+name);
		System.out.println("Your Account Balance is: "+balance);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
