package advancedArrayString;

import java.util.Scanner;

public class RotationOfArray {
	
	//To rotate RightSide >> start loop from length-1 to 1 and arr[i]=arr[i-1]
	//To rotate LeftSide >> start loop from 0 to length-2 and arr[i]=arr[i+1]
	
	static void rightSwap(int[] arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i-- ) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//taking size 
		System.out.println("metion the size first");
		int size= sc.nextInt();
		//creating array using size
		int[] arr= new int[size];
		//taking input for array
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		//metion how many times u want to rotate
		int r=2;
		for(int i=1; i<=r; i++) {
			rightSwap(arr);
		}
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		
	}

}
