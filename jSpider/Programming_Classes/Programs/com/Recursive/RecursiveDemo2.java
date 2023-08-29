package com;


public class RecursiveDemo2 {
	
	static void print(int n) { //condsitional recursive functions
		
		if(n<6) {
			System.out.println("Hello World");
			print(n+1);
			
		}
	}
	public static void main(String[] args) {
		print(1);
	}

}
