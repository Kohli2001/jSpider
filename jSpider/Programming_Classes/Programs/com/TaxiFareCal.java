package com;
import java.util.Scanner;

public class TaxiFareCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total traveling distance in KM ");
		
		int km = scanner.nextInt();
		
		if (km<=2) {
			System.out.println("Total Fare " +30);
			
		}
		else if (km<=7) {
			System.out.println("Total Fare = "+30+(km-2)*15);
			
		}
		else if (km<=12) {
			System.out.println("Total Fare"+105+ (km-7)*20);
			
		}
		else {
			System.out.println("Total Fare = " + 205+(km-12)*25);
		}
		

	}

}
