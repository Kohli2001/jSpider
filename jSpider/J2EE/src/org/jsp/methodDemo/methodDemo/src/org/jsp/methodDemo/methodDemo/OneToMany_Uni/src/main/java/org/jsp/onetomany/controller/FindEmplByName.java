package org.jsp.onetomany.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Employee;

public class FindEmplByName {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Name to fetch the details");
		String name = sc.nextLine();
		String qry ="select e from Employee e where e.name=?1";
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Employee> emps = q.getResultList();
		if(emps.size()>0) {
			for (Employee e : emps) {
				
				System.out.println("Employee Id: "+e.getId());
				System.out.println("Employee Name: "+e.getName());
				System.out.println("Employee Designation:"+e.getDesg());
				System.out.println("Employee Salary: "+e.getSalary());
				
				System.out.println("----------------------------------------------");
				
			}
		}
		else {
			System.err.println("Invalid Department Name...");
		}
		
	}

}
