package org.jsp.project.dao;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.Employee;

public class EmployeeDao {
	
	EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Scanner sc = new Scanner(System.in); 
	
	
	//inserting the employee....
	
	public void saveEmployee(Employee emp) {
		System.out.println("Enter the Employee NAME,AGE,SALARY,PHONE, EMAIL, DOB(YYYY-MM-DD)");
		String name=sc.next();
		int age = sc.nextInt();
		double salary = sc.nextDouble();
		long phone = sc.nextLong();
		String email = sc.next();
		LocalDate dob= LocalDate.parse(sc.next());
		
		emp=new Employee(name, salary, age, dob, phone, email);
		manager.persist(emp);
		
		
	}

	public void updateEmployeeById(int id) {

	}

	public void deleteEmployeeById(int id) {

	}

	public void findEmployeeById(int id) {

	}

	public void getAllEmployee() {

	}
	

}
