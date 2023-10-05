package twoDArray;

import java.util.Scanner;

public class SwapingRowCol {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = sc.nextInt();
		System.out.println("enter number of cols");
		int cols= sc.nextInt();
		
		//creating 2d array
		
		int[][] arr= new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr[i].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
//		pritning the array
		
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
			
		}
	}
	}


