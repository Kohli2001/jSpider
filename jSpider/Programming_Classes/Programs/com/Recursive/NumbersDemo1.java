package com;
import java.util.Scanner;

public class NumbersDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit  number");
		int num = sc.nextInt();
		System.out.println("Last Digit of given number "+num+ " is:" +num%10);
		
	
	}

}
