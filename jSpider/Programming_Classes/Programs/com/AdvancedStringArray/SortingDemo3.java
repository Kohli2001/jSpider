package advancedArrayString;

import java.util.Scanner;

public class SortingDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int[] arr= new int[size];
		System.out.println("give the array input");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target sum");
		int sum=sc.nextInt(); int c=0;
		
		for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					
					if(sum==arr[i]+arr[j]) {
						c++;
						System.out.println(arr[i] +" "+arr[j]);
						break;
					}
				}
		}
		
		
		if(c==0) {
			System.out.println(-1);
		}
	}
}
