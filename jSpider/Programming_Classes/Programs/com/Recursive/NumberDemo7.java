package com;

import java.util.Scanner;

public class NumberDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");//668
		int n = sc.nextInt();
		int r=0 , c=0;
	while(n!=0) {
		r = n%10;
		if(r==0) {
			c++;
		}	
		n=n/10;
	}
	if(c==1) {
		System.out.println("Duck number");
	}
	else {
		System.out.println("Not a Duck Number");
	}

}
}
