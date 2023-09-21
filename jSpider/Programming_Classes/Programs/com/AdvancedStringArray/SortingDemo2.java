package advancedArrayString;

import java.util.Scanner;

public class SortingDemo2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int [] arr  = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int ele: arr) {
			for(int ele2 : arr) {
				System.out.println(ele +" "+ele2);
			}
		}
	}

}
