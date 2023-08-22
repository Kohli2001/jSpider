package com;

import java.util.Scanner;

public class NumberDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printing total count of the number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");//668
		int n = sc.nextInt();
		int c=0;
//		int r = 0;
		while (n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("printing total count of the number"+c);
//		while (n!=0) {
//
//				r=n%10;
//				c++;
//			    n=n/10;
//
//		}
//		System.out.println(c);
//	}
	}	

}
