package practice;

import java.util.Iterator;
import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto number");
		int n = sc.nextInt();
		
		int n1=0 , n2=1, n3=0;
		System.out.println(n1+" \n" +n2);
		for(int i=1; i<=n; i++) {
			
			n3=n1+n2;
			
			System.out.println(n3 +" ");
			n1=n2;
			n2=n3;
		}
		
		
		
	}

}
