package com;

import java.util.Scanner;

public class NumisFib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check ");
		int n = sc.nextInt();
		System.out.println(isFib(n)?"Fibanacii number":"Not Fibanacii number");
	}
	static boolean isFib(int n) {
		
		int n1=0 , n2=1, sum=0, i=1;
		while(n1<=n) {
			if (n1==n) {
				return true;
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return false;
	}

}
