package com;


import java.util.Scanner;
public class PrimeNumber {
	
	//checking nth prime number
	
	static boolean isPrime(int n ) {
		if(n<=1) {
			return false;
		}
		for(int i=2 ; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter nth number for get series of prime number");
		int n = scanner.nextInt();
		
		int c=0;
		for(int i=2 ; ; i++) {
			if(isPrime(i)) {
//				System.out.println(i);
				c++;
			}
		
		if (c==n) {
			System.out.println(i);
			break;
			
		}
		}
		

	}

}
