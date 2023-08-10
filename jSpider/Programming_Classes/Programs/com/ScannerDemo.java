package com;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter mobile number");

	        long phone = sc.nextLong();

	        System.out.println("Enter your name ");
	        String name = sc.nextLine();
	        
//	        System.out.println("checking next()");
//	        
//	        String str  = sc.nextLine();

	        
	        

	        System.out.println("Enter your email id ");

	        String email = sc.nextLine();

	        

	        System.out.println(name);       
	        System.out.println(phone);
	        System.out.println(email);

//	        System.out.println(str);
	        
	        
	        
	        
	        //Problem 2 
	        
	        
	        System.out.println("enter first name");
	        String firstName= sc.next();
	        System.out.println("enter full name");
	        String fullName = sc.nextLine();
	        System.out.println("enter number");
	        int num = sc.nextInt();

	        System.out.println(firstName);
	        System.out.println(fullName);
	        System.out.println(num);

	}

}
