package twoDArray;
import java.util.Scanner;

public class MaxSumOfRows {
	
	//Assignment print the col no which is having max number
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = sc.nextInt();
		System.out.println("enter number of cols");
		int cols= sc.nextInt();
		
		//creating 2d array
		
		int[][] arr= new int[rows][cols];
		
		//taking input from user 
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int temp=0 , ans=0;
		for(int i=0; i<rows; i++) {
			int sum=0;
			for(int j=0; j<cols; j++) {
				 sum=sum+arr[i][j];
			}
			if(temp<sum) {
				temp=sum;
				ans=i;
			}
		}
		System.out.println(" row no: "+ans);
		//printing the given matrix 
		
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				
//				System.out.print(arr[i][j] +" ");	
//			}
//			System.out.println();
//		}
	}

}
