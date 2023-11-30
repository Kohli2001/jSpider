package org.dsa.mergesort;

public class MergeArray {
	 static int[] arr= new int[5];
	
	static void put(int ele) {
		int index= ele%arr.length;
		for(int i=0; i<arr.length; i++) {
			arr[index] =ele;
		}
	}
	static void display() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0 && arr[i]!=-1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		put(10);
		put(50);
		put(23);
		display();
		//value%5
		
		
	}

}
