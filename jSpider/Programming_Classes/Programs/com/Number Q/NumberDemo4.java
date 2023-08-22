package com;

import java.util.Scanner;

public class NumberDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");//668
		int n = sc.nextInt();
		int r=0;
		System.out.println("The reverse of given digit be like");
		while (n!=0) {
			
			r=n%10;
			System.out.print(r +" ");
			n=n/10;
		}

	}

}
