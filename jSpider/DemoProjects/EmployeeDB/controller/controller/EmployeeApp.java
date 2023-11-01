package controller;

import service.EmployeeService;
import serviceimpl.EmployeeServiceImpl;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService e = new EmployeeServiceImpl();
		System.out.println("==========Welcome To Employee Database=========");
		while (true) {
			System.out.println("========Menu=========");
			System.out.println(
					"1.Add Employee\n2.Display All Employee Details\n3.Search Emp by Eid\n4.Searching Emp by Salary\n5.Updating Employee\n6.Remove Employee. \n7.Exit");
			System.out.println("Please enter your option");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				e.addEmp();
				break;

			case 2:
				e.getAllEmp();
				break;
			case 3:
				e.getEmpyByid();
				break;
			case 4:
				e.findEmpByRangSal();
				break;
			case 5: 
				e.updateEmpByEid();
				break;
			case 6:
				e.removeEmpByEid();
				break;
			case 7:
				System.out.println("====Thank You Visit Again=====");
				System.exit(0);
				break;
			default:
				System.out.println("=====Invalid option=====");
			}
		}
	}
}
