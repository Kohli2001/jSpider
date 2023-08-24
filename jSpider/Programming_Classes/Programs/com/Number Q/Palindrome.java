package com;

import java.util.Scanner;

public class Palindrome {
	
	static int reverseDigit(int n) {
		int r=0 , rev=0;
		while(n!=0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int m=n;
		if (reverseDigit(n)==m) {
			System.out.println("Palindrome Number ");
			
		}
		else {
			System.out.println("Not a palindrome number");
		}

	}

}
