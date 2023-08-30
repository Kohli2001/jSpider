package com;

public class RecursiveDemo8 {
	
	static void pattern(int n) {
		
		if(n>=1) {
			System.out.println(n);
			pattern(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int n = 3;
		pattern(n);
				
	}

}
