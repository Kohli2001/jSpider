package org.dsa.basics.bstprogrammingTest;

import java.util.Arrays;

public class Program2 {
	
	public static void main(String[] args) {
		int target=10;
		int [] arr1= {1,4,2,6,7,3,5,1,5,};
			Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]+arr1[j]==target) {
					System.out.println(arr1[i]+","+arr1[j]);
				}
			}
		}
		
	}

}
