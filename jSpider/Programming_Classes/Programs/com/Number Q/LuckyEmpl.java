package com;

import java.util.Scanner;

public class LuckyEmpl {
	
	static String isPrime(int n) {
		int c=0;
		for(int i =1; i<=n; i++) {
			if(n%i==0) {
				c++;
			}
				
		}
		return c==2?"Lucky Employee":"UnLucky Employee";
	}
	static int reverseDigit(int  n) {
		int r=0, rev=0;
		while(n!=0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id = sc.nextInt();
		int  r=0 ,sum=0, count=0, empid=id;
		
		int reverseId=reverseDigit(id);
		
		for(int i=1; i<=4; i++) {
			r = reverseId%10;
			sum+=r;
			reverseId=reverseId/10;
		}
		System.out.println(isPrime(sum));
		
		
	}
		
			
	}

