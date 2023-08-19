package com;
import java.util.Scanner;

public class CodeTest1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Anything");
		
		char  c = scanner.next().charAt(0);
		
		if (c>='A' && c<='Z' || c>='a' && c<='z') {
			
			System.out.println("Alpha char.........");
			
		}
		else if(c>='0' && c<='9') {
			System.out.println("Numeric value........");
		}
		else {
			System.out.println("Special char");
		}
		
		

	}

}
