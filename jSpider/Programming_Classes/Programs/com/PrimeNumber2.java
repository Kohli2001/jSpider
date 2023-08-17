package com;

public class PrimeNumber2 {
	
	
	//program to print 1 to n prime numbers in series.......... such as 2,3,5,7,
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  n =100;
		for(int i=2; i<=n; i++) {
			if(isPrime(i))
			System.out.println(i);
			
		}

	}

}
