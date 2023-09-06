package com;

public class ArrayDemo6 {
public static void main(String[] args) {
	int [] arr= {1,4,7,2,3,8,12};
	
	for(int i=0; i<arr.length-1; i++) {
		arr[i]= arr[i]+arr[i+1];
	}
	arr[arr.length-1]=0;
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
