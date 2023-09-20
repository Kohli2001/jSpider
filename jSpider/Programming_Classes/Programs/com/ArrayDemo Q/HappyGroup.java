package com;

import java.util.Scanner;

public class HappyGroup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter size of array");
		int size = scanner.nextInt();
		int [] arr= new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int max=arr[0], sum=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			sum=sum+arr[i];
		}
		
		System.out.println(max==(sum-max)?"Unique element":"Not unique element");
	}
	
	

}
