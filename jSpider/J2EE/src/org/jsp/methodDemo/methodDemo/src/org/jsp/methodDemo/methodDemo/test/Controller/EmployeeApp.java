package org.jsp.test.Controller;

import java.sql.SQLException;

import java.util.List;
import java.util.Scanner;

import org.jsp.test.dao.EmployeeDao;
import org.jsp.test.dto.Employee;

public class EmployeeApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		
		
		boolean flag = true;
		while(flag) {
		System.out.println("=========Employee App=========");
		System.out.println("1.Save Employee\n2.Update Employee\n3.Find Employee By Id\n4.verify employee by phone and password\n5.verify employee by email and password\n6.find employee by designation\n7.Filter the employee by salary\n8.Exit");
		
		System.out.println("Select any opetion from above");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:{
			System.out.println("Enter Employee id , name , deisgnation, salary , email, phone , password to save the Employee");
			int id = sc.nextInt();
			String name = sc.next();
			String desi = sc.next();
			double sal = sc.nextDouble();
			String email= sc.next();
			long phone = sc.nextLong();
			String pass= sc.next();
			Employee e = new Employee(id, name, desi, sal, phone, email, pass);
			System.out.println(dao.saveEmployee(e));
			break;
		}
		case 2:{
			System.out.println("Enter Employee id , name , deisgnation, salary , email, phone , password to Update the Employee");
			int id = sc.nextInt();
			String name = sc.next();
			String desi = sc.next();
			double sal = sc.nextDouble();
			String email= sc.next();
			long phone = sc.nextLong();
			String pass= sc.next();
			Employee e = new Employee(id, name, desi, sal, phone, email, pass);
			System.out.println(dao.updateEmployee(e));
			break;
		}
		case 3:{
			
			System.out.println("Enter the id to find the Employee");
			int id = sc.nextInt();
			Employee e1 = dao.findEmployeeById(id);
			if (e1 != null) {
				System.out.println("Employee Found");
				System.out.println("Id:" + e1.geteId());
				System.out.println("name: "+e1.geteName());	
				System.out.println(" desi:" +e1.geteDesignation());
				System.out.println(" salat: "+e1.geteSalary());
				System.out.println(" Decription:" +e1.geteEmail());
			} else {
				System.err.println("Invalid Id");
			}
			break;
		}
		case 6:{
			System.out.println("Enter designation ");
			String desi = sc.next();
			List<Employee> emp = dao.findEmployeeByDesignation(desi);
			if(emp.size()>0) {
				for (Employee e1 : emp) {
					System.out.println("emplloyee Found");
					System.out.println("Id:" + e1.geteId());
					System.out.println("name: "+e1.geteName());	
					System.out.println(" desi:" +e1.geteDesignation());
					System.out.println(" salat: "+e1.geteSalary());
					System.out.println(" Decription:" +e1.geteEmail());

					System.out.println("------------------------------------");
					
				}
			}
			else {
				System.err.println("Employee not found...!!");
			}

				break;
		}
		case 7:{
			System.out.println("Enter the Salary");
			double sal = sc.nextDouble();
			List<Employee> emp = dao.filterBySalary(sal);
			if(emp.size()>0) {
				for (Employee e : emp) {
					System.out.println("employee Found");
					System.out.println(" Id:" + e.geteId());
					System.out.println(" Name:" + e.geteName());
					System.out.println(" desi:" +e.geteDesignation());
					System.out.println(" salat: "+e.geteSalary());
					System.out.println(" Decription:" +e.geteEmail());

					System.out.println("------------------------------------");
				}
			}
			break;
			
		}
		case 8:{
			try {
				System.err.println(dao.exit());
				flag=false;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

		default:
			System.out.println("Invalid choice");
			
			break;
		
		
		}
		
		}
	}
}
		


//----


