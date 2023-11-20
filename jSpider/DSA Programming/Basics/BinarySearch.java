package org.dsa.basics;

import java.util.Scanner;

public class BinarySearch {
	
	static int search(int[] arr, int key) {
		int l=0, h=arr.length-1, mid=(l+h)/2;
		while(l<=h) {
		if(arr[mid]==key) {
			return mid;
		}
		else if (arr[mid]<key) {
			l=mid+1;
		} 
		else if (arr[mid]>key) {
			h=mid-1;
			
		}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {5,10,25,35,88,120,180};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key");
		int key =scanner.nextInt();
		System.out.println(search(arr, key));
	}

}
