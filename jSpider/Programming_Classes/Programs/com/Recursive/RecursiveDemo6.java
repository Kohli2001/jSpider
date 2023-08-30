package com;




public class RecursiveDemo6 {
	
	static int sumN(int n) {
		
		if(n==0) {
			return 0;
		}
		else {
			return n+sumN(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumN(n));
	}

}
