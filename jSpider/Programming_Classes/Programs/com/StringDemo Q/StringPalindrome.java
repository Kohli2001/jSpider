package com;

import java.util.Scanner;

public class StringPalindrome {
	
	static boolean isReverse(String s) {
			int i=0, j=s.length()-1;
			while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;	
		}
			
			return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.nextLine();
		
		System.out.println(isReverse(s)?"String Palindrome":"not a palindrome");
		
	}

}
