package org.dsa.basics;

public class PrintStarUsingRecursion {
	
	static void col(int num) {
		if(num>=1) {
			System.out.print("* ");
			col(num-1);
		}
	}
	static void row(int num) {
		if(num>=1) {
			col(5);
			System.out.println();
			row(num-1);
		}
	}
	public static void main(String[] args) {
		row(5);
	}

}

