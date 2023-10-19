package serviceimpl;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService {
	
	void generatingId(int id) {
		
	}
	
	//creating dumy memory 
	ArrayList<Employee> l1 = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addEmp() {
		System.out.println("Running...........!!!");
		System.out.println("++++++++++Enter Employee details+++++++++++++");
		System.out.println("enter employee id:");
		int eId= sc.nextInt();
		System.out.println("Enter employee Name");
		String eName = sc.next();
		System.out.println("Enter the Employee Designation");
		String eDesignation = sc.next();
		System.out.println("Enter the Employee Salary");
		double eSal = sc.nextDouble();
		System.out.println("Enter the Employee phone no");
		long ePhone = sc.nextLong();
		System.out.println("Enter the Employee Age ");
		int eAge = sc.nextInt();
		
		l1.add(new Employee(eId, eName, eDesignation, eSal, ePhone, eAge));
		System.out.println("Employee Added SuccessFully..........!!!");
	
	}

	@Override
	public void getAllEmp() {
		System.out.println("fetching Employee details");
		if(l1.isEmpty()==true) {
			System.out.println("There are no employee in  Company");
		}
		else {
			for (Employee details : l1) {
				System.out.println(details);
				
			}
		}
		
	}
	
	
	
	

}
