package com;

public class RecursiveDemo4 {
	static int  i=1;
	static void print(int n) { //prtinting 1 to 100
		
		if(i<=n) {
			System.out.println(i);
			i++;
			print(n);
		
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(100);
	}

}
