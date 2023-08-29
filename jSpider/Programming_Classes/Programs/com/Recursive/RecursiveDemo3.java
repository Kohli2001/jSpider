package com;

public class RecursiveDemo3 {
	  
	static void print(int n) {   //prtinting 100 to 1
		if(1<=n) {
//			System.out.println("Hello World");
			System.out.println(n);
			print(n-1);
		}
		
	}
public static void main(String[] args) {
	print(100);
	
}
}
