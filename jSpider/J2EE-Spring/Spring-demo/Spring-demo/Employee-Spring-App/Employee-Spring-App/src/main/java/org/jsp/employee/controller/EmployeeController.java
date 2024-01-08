package org.jsp.employee.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.employee.EmployeeConfig;
import org.jsp.employee.dao.EmployeeDao;
import org.jsp.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeController {

	private static Scanner sc = new Scanner(System.in);
	private static EmployeeDao dao;

	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		dao = context.getBean(EmployeeDao.class);
	}

	public static void main(String[] args) {
		
		boolean flag = true;
		while(flag) {
		System.out.println("=================Welcome To Employee App==============");
		System.out.println("----------------------------------------------------------");
		System.out.println(
				"1.Save Employee\n2.Update Employee\n3.Find Employee By Id\n4.Verify Employee By Phone and Password"
						+ "\n5.Verify Employee By Email and Password\n6.Verify Employee By Id and Password\n7.Find Employee By Designation"
						+ "\n8.Find Employee By name\n9.Find Employee By Salary\n10.Filter Employee By salary Range\n11.Exit ");

		switch (sc.nextInt()) {
		case 1:
			save();
			break;
		case 2:
			update();
			break;
		case 3:
			findById();
			break;
		case 4:
			verifyByPhoneAndPassword();
			break;
		case 5:
			verifyByEmailAndPassword();
			break;
		case 6:
			verifyByIdAndPassword();
			break;
		case 7:
			findByDesig();
			break;
		case 8:
			findByName();
			break;
		case 9:
			findBySalary();
			break;
		case 10:
			filter();
			break;
		case 11:
			flag=false;
			System.exit(0);
		default:
			break;
		}

	}
	}

	static void save() {
		System.out.println("Enter the Employee name, salary, email , phone, password, desig to Register the employee");
		Employee emp = new Employee();
		emp.setName(sc.next());
		emp.setSalary(sc.nextDouble());
		emp.setEmail(sc.next());
		emp.setPhone(sc.nextLong());
		emp.setPassword(sc.next());
		emp.setDesig(sc.next());

		dao.saveEmployee(emp);
		System.out.println("employee saved successfully with Id: " + emp.getId());

	}

	static void update() {
		System.out.println("Enter the Employee Id to update");
		int eid = sc.nextInt();
		System.out.println("Enter the name,phone,email,salary,designation and password to Update");
		Employee e = new Employee();
		e.setId(eid);
		e.setName(sc.next());
		e.setPhone(sc.nextLong());
		e.setEmail(sc.next());
		e.setSalary(sc.nextDouble());
		e.setDesig(sc.next());
		e.setPassword(sc.next());
		e = dao.updateEmployee(e);
		if (e != null)
			System.out.println("Employee  with Id:" + e.getId() + " Updated");
		else
			System.err.println("Cannot Update Employee as entered Id is invalid");
	}

	static void findById() {
		System.out.println("Enter employee id to find employee");
		int id = sc.nextInt();
		Employee e = dao.findEmpById(id);
		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("Unable to fetch the Employee due to Invalid Id");
		}

	}

	static void verifyByPhoneAndPassword() {
		System.out.println("Enter the Phone number and password to verify the Employee");
		long phone = sc.nextLong();
		String pass = sc.next();
		Employee e = dao.verifyEmployee(phone, pass);
		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("Invalid Employee phone number and password");
		}
	}

	static void verifyByEmailAndPassword() {
		System.out.println("Enter the Email Id and password to verify the Employee");
		String email = sc.next();
		String pass = sc.next();
		Employee e = dao.verifyEmployee(email, pass);
		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("Invalid Employee email and password");
		}

	}

	static void verifyByIdAndPassword() {
		System.out.println("Enter the  Id and password to verify the Employee");
		int id = sc.nextInt();
		String pass = sc.next();
		Employee e = dao.verifyEmployee(id, pass);
		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("Invalid Employee Id and password");
		}

	}

	static void findByName() {
		System.out.println("Enter the Employee Name");
		String name = sc.next();
		List<Employee> emp = dao.findEmpByName(name);
		if (emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("No Such employee with entered Designation");
		}
	}

	static void findBySalary() {
		System.out.println("Enter the Employee Salary");
		double salary = sc.nextDouble();
		List<Employee> emp = dao.findEmpBySalary(salary);
		if (emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("No Such employee with entered Designation");
		}
	}
	
	static void findByDesig() {
		System.out.println("Enter the Employee Designation");
		String desig = sc.next();
		List<Employee> emp = dao.findEmpByDesg(desig);
		if (emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("No Such employee with entered Designation");
		}
	}
	static void filter() {
		System.out.println("Enter the lower salary and higher saalry to filter");
		double low = sc.nextDouble();
		double high = sc.nextDouble();
		List<Employee> e = dao.filter(low, high);
		if(e!=null) {
			System.out.println(e);
		}
		else {
			System.out.println("No such employee within Given Range of Salary");
		}
	}

}
