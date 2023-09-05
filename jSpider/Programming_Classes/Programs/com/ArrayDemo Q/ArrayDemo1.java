package com;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		
		//creating array as given size 
		int [] arr = new int[size];
		
		//taking inputs as array from users
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of given Array : " +sum);
	}

}
