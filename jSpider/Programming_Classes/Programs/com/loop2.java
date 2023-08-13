package com;
import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//to get sum of the natural number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente number");
		
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
			
		}
		System.out.println("sum:" +sum);
		
		
		
	}

}
