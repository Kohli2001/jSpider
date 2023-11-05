package org.jsp.methodDemo;

public class Calculator {

	public static void print() {
		System.out.println("Welcome to the world of method");
	}
	public static void printsum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started.");
		print();
		printsum((int)10.25, (int)20.255);
		System.out.println("main method ended");
	}
}
