package practice;

import java.util.*;

public class intToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to convert an integer number to a binary number.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the integer");
		
		 int n = scanner.nextInt();
		 
		 String b= Integer.toBinaryString(n);
		 System.out.println("the Binary value of given number is "+b);
		

	}

}
