package org.dsa.basics;

import java.util.Scanner;

public class LinearSerach {
	
	static int search(int[]arr , int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,67,12,7,88,34};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key value to serach");
		int key = scanner.nextInt();
		
		System.out.println("The index of key is: " +search(arr, key));
		
	}

}
