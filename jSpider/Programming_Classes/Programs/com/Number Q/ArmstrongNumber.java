package com;

import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongNumber {
	static int countDigit(int n) {
		int r=0 , c=0;
		while(n!=0) {
			r=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	
	static int  power(int base , int exp) {
		int pow=1;
		
		for(int i=1; i<=exp; i++) {
			pow = pow*base;
		}
		return pow;
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = sc.nextInt();
		int exp = countDigit(n);
		int  m =n, sum=0;
		
		while(n!=0) {
			int r=n%10;
			sum=sum+power(r, exp);
			n=n/10;
		}
		System.out.println(sum==m?"armstrong": "not armstrong");
	}
	

}
