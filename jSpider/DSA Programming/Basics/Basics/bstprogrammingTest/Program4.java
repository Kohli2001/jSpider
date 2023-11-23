package org.dsa.basics.bstprogrammingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String s1= scanner.next();
		String s2 = scanner.next();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String Anagram");
		}
		else {
			System.out.println("String not Anagram");
		}

}
}
