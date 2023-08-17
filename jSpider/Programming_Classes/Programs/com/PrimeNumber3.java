package com;


public class PrimeNumber3 {
	static boolean isPrime(int  n) {
		int  c=0; 
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		return c==2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=9, c=0;
		for(int i=2;  ; i++) {
			if(isPrime(i)) {
				c++;
			}
			
			if(c==n) {
				System.out.println(i);
				break;
			}
			
		}
		
		
	}

}
