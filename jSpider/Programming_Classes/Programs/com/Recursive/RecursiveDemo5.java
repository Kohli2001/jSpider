package com;

public class RecursiveDemo5 {
	
	static void print(int n) { // pritinng 1 to 200;
		if(n>=1) {
			print(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		
		print(200);
	}

}
