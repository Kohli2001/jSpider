package com;
import java.util.Scanner;

public class usingNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		if (n>0) {
			System.out.println("positive number" +n);
			if (n%2==0) {
				System.out.println("Even");
				
			}
			else {
				System.out.println("odd");
			}
			
		}
		else if (n<0) {
			System.out.println("Negative number "+n);
			
		} 
		else {
			System.out.println("Neutral");
		}
			
		
		

	}

}
