package com;

import java.util.Scanner;

public class FibonaciiNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto what number u want series fib no");
		int n = sc.nextInt();
		int n1=0, n2=1, sum=0, i=1;
		
	while(i<=n) {
		
		System.out.print(n1 +" ");
		sum=n1+n2;
		n1= n2;
		n2=sum;
		i++;
	 }
	
   }

  }
