package org.dsa.basics;

import java.util.Scanner;

public class StringAnagram {

	static String sort(char [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		return new String(arr);
	}
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String s1= scanner.next();
		String s2 = scanner.next();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		s1= sort(arr1);
		s2= sort(arr2);
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String Anagram");
		}
		else {
			System.out.println("String not Anagram");
		}
		
		
	}

}
