package com;
import java.util.Scanner;

public class StrongNum {
	
	static int  fact(int n) {
		
		int  f=1;
		for(int i=1; i<=n; i++) {
			f*=i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int m=n;
		int r =0 , sum=0;
		while(n!=0) {
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
			
		}
		if (sum==m) {
			System.out.println("Strong number!....");
			
		}
		else {
			System.out.println("Not String number......");
		}
		

	}
	

}
