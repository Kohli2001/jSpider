package org.jsp.onetomany.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Employee;

public class FindEmplById {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the Employee Id to fetch the data");
		int id = sc.nextInt();
		String qry = "select e from Employee e where e.id=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Employee e= (Employee)q.getSingleResult();
			System.out.println("Employee ID:"+e.getId());
			System.out.println("Employee Name:"+e.getName());
			System.out.println("Employee Designation: "+e.getDesg());
			System.out.println("Employee Salary: "+e.getSalary());
			
			
		}
		catch (NoResultException e) {
			System.err.println("Invalid Empoyee Id");
		}
		
	}

}
