package com;

import java.util.Scanner;

public class PremiumNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = sc.nextInt();
		int c=0 , r=0;
		while(id!=0) {
			r=id%10;
			if(r==8) {
				c++;
			}
			
			id=id/10;
		}
		if(c>3) {
			System.out.println("You are Lucky Students");
		}
		else {
			System.out.println("No! u r not Lucky");
		}
	
		
	}

}
