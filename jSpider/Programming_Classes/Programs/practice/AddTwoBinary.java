package practice;

import java.util.*;

public class AddTwoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st binary value");
		String b1 = sc.next();
		System.out.println("Enter the 2nd binary value");
		String b2 = sc.next();
		
		
		int n1 = Integer.parseInt(b1, 2);
		int n2 = Integer.parseInt(b2, 2);
		
		int n3 = n1+n2;
		
		System.out.println("Sum of the given binary value in integer is "+n3+ "\n and binary value is " +Integer.toBinaryString(n3));
		

	}

}
