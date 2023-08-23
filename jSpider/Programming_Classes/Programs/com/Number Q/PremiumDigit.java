package com;

import java.util.Scanner;

public class PremiumDigit {
	
	static String isPrime(int n) {
		int  c=0;
		for(int i=1; i<=n; i++) {
			if (n%i==0) {
				c++;	
			}
		}
		return c==2?"Premium Number":"No Premium number";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = sc.nextInt();
		System.out.println("Enter a digit");
		int  d  = sc.nextInt();
		int c=0 , r=0;
	    while(n!=0) {
	    	r=n%10;
	    	if (r==d) {
	    		c++;
				
			}
	    	n=n/10;
	    	
	    }
	    System.out.println(isPrime(c));
	}

}
