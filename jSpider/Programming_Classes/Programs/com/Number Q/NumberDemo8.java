package com;

import java.util.Scanner;

public class NumberDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");//668
		int n = sc.nextInt();
		int r=0 , sum=0 , pro=1;
		while(n!=0) {
			
			r=n%10;
			sum+=r;
			pro*=r;
			n=n/10;	
			
			
	}
		if (sum==pro) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not A spy number");
		}

}
}
