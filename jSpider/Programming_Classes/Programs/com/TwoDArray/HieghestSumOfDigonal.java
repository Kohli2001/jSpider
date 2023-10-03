package twoDArray;

import java.util.Scanner;

public class HieghestSumOfDigonal {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
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
			int sum=0; int sum2=0;
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					if(i==j) {
						sum+=arr[i][j];
					}
					if (i+j==arr.length-1) {
						sum2+=arr[i][j];
						
					}
				}
			}
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					
					System.out.print(arr[i][j] +" ");	
				}
				System.out.println();
			}
			if(sum>sum2) {
				System.out.println("left daiogonal");
			}
			else {
				System.out.println("right daigonal");
			}
		}

}
