package com;
import java.util.Scanner;

public class ElectricBillCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		String  name = sc.nextLine();
		System.out.println("Enter your Cust ID");
		int id = sc.nextInt();
		
		System.out.println("Enter Consumed Unit");
		double unit = sc.nextDouble();
		
		
		System.out.println("------------------------------------");
		
		System.out.println("Customer ID: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Consumed Unit: "+unit);
		
		double totalBill= 0.0;
		
		
		
		if (unit<=199) {
			
			unit=unit*1.20;
			
			System.out.println("Amount charge @1.20 per unit : "+unit);
			
			System.out.println("Net Amount paid by customer:" +unit);
			
			
		}
		else if (unit>=200 && unit<400) {
			
			unit=unit*1.50;
			
			System.out.println("Amount charge @1.50 per unit : "+unit);
			
			System.out.println("Net Amount paid by customer:" +unit);
			
			
		}
		else if (unit>=400 && unit<600) {
			
			  unit=unit*1.80;
			
			 double ExtraCHrge = unit*15/100;
			
			 totalBill = unit+ExtraCHrge;
			 
			
			System.out.println("Amount charge @1.80 per unit : "+unit);
			
			System.out.println("SuchCharges Amount :" +ExtraCHrge);
			
			System.out.println("Net Amount paid by customer:" +totalBill);
			
			
		}
		else if (unit>=600) {
			
			unit=unit*2.00;
			
			double ExtraCHrge = unit*15/100;
				
			totalBill = unit+ExtraCHrge;
			
			
			System.out.println("Amount charge @2.00 per unit : "+unit);
			System.out.println("SuchCharges Amount :" +ExtraCHrge);
			System.out.println("Net Amount paid by customer:" +totalBill);
			
			
			
		}
		

	}

}

