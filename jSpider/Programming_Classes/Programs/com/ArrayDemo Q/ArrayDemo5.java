package com;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] arr= {7,99,23,65,18,27,45,12};
		
		int max=arr[arr.length-1];
		for(int i =arr.length-1; i>=0; i--) {
			if(arr[i]<max) {
				arr[i]=max;
			}
			else {
				max=arr[i];
				arr[i]=-1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
