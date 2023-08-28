package com;

import java.util.Scanner;

public class FibWithinRange {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first  range");
	int r1 = sc.nextInt();
	System.out.println("Enter second  range");
	int r2 = sc.nextInt();
	int n1=0, n2=1, sum=0, i=1 , c=0;
	while(n1<=r2) {
		if(n1>=r1) {
			System.out.println(n1);
			
		}
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}

}
}
