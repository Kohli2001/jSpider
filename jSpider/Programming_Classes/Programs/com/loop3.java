package com;
import java.util.Scanner;
public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner  = new Scanner(System.in);
		System.out.println("enter the factorial number");
		int num = scanner.nextInt();
		
		int fact=1; 
		for(int i =1; i<=num; i++) {
			fact*=i;
			
		}
		System.out.println(fact);
	}

}
