package com;

import java.util.Scanner;

public class NumberDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");//668
		int n = sc.nextInt();
		int r=0 , sum=0;
		while (n!=0) {
			r=n%10;
			sum+=r;
			n=n/10;
			
		}
		System.out.println("sum of digit :" +sum);
	}

}
