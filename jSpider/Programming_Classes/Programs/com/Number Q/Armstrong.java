package practice;

import java.util.Scanner;

public class Armstrong {
	
//	static int lengthOfNum(int  n) {
//		int r=0, c=0;
//		while(n!=0) {
//			r=n%10;
//			c++;
//			n=n/10;
//		}
//		return c;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt(); 
	    int m=n; int r=0, sum=0;
		
		while(n!=0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if (sum==m) {
			System.out.println("Armstrong number");
			
		}
		else {
			System.out.println("Not a armstrong number");
		}
	}
	
	
	

}
