package org.dsa.basics;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {18,5,6,3,11,4};
		
		for(int i=0; i<arr.length; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
