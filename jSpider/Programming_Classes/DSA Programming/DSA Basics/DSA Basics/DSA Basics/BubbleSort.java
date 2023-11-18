package org.dsa.basics;

public class BubbleSort {
	
	static void Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}	
	public static void main(String[] args) {
		System.out.println("==================");
		int[] arr = {1,11,5,23,16};
		Sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
