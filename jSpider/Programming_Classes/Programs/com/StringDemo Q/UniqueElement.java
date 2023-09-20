package com;

import java.util.Scanner;

public class UniqueElement {
	
	static boolean isPrime(int n) {
		int c=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				c++;
				
			}
		}
		return c==2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s= sc.nextLine();
		
		System.out.println("Enter char to check");
		char c = sc.next().charAt(0);
		int pos=-1;
		for(int i=0; i<s.length(); i++) {
			if(c==s.charAt(i)) {
				pos=i;
				
			}
		}
		System.out.println(isPrime(pos)?"unique element":"not unique ");
			 
	}

}
