package twoDArray;

import java.util.Scanner;

public class TransposeOfMatrix {
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
//		pritning the array
		
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
			
		}
	}

}
