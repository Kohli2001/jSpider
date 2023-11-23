package org.dsa.basics.bstprogrammingTest;

public class Program3 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,12,7,8,9,10};
		int [] arr1= new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					
				}
			}
		}
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}
