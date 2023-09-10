package com;

public class TechNumber {
	static int countDigit(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
		
	}
	public static void main(String[] args) {
		int n = 2055;
		int c = countDigit(n);
		
		if(c%2==0) {
			int m= (int)Math.pow(10, c/2);
			int sum = (n%m+n/m);
			System.out.println(sum);
		}
		else {
			System.out.println("invalid");
		}
	}

}
