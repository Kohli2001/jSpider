package controller;

import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmployeeServiceimpl;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeService e1 = new EmployeeServiceimpl(); //upcating 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Welcome to Employee DataBase");
		while(true) {
			System.out.println("========Menu========");
			System.out.println("Please choose from below mentioned...");
			System.out.println("1.Add Employee\n2.Display all the details\n3.Exit");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				e1.addEmp();
				break;
				
			case 2:
				e1.getAllEmp();
				break;
			case 3:
				System.out.println("Thank you! Visit Again...");
				System.exit(0);
			default:
				System.out.println("Invalid options=======");
				break;
			}
			
		}
		
		
	}

}
