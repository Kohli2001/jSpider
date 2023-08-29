package com;




public class RecursiveDemo1 {
	
	
	static void print(int n) {
		
		System.out.println("Hello"); // it leads to stack overFlow Exception
		print(n);
	}
	
	public static void main(String[] args) {
		print(100);
		
	}

}
