package com;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("insert the values cosider as zeroth index");
		for(int i=0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		//printing the inserted Array elements
		System.out.print("Inserted Arrays are :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
