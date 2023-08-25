package com;

import java.util.Scanner;

public class Power {
	
	static int power(int exp, int base) {
		int pow=1;
		for(int  i=1; i<=exp; i++) {
			pow=pow*base;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = sc.nextInt(); 
		int ans=0;
		int  r=0 , c=0;
		while(n!=0) {
			r=n%10;
			c++;
			n=n/10;
		}
		int sum=power(r, c);
		System.out.println(sum);
	}

}
