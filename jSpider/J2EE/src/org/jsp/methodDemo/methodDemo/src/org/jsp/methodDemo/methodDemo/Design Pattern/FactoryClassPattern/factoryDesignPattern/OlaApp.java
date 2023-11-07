package org.jsp.factoryDesignPattern;

import java.util.Scanner;

public class OlaApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OlaFactory factory = new OlaFactory();
		while(true) {
		System.out.println("Choose one of the Ola");
		System.out.println("1.Prime\n2.Mini\n3.Auto");
		int choice = sc.nextInt();
		OLA cab = null;
			switch(choice) {
			case 1:
				cab=factory.getOla("prime");
				System.out.println("Cost per KM "+cab.getCostPerKm());
				break;
			case 2:
				cab = factory.getOla("Mini");
				System.out.println("Cost per KM "+cab.getCostPerKm());
				break;
				
			case 3:
				cab= factory.getOla("auto");
				System.out.println("Cost per KM " +cab.getCostPerKm());
				break;
				
				default: 
					System.out.println("Not such type of OLA Available");
			}
		}
}
}
