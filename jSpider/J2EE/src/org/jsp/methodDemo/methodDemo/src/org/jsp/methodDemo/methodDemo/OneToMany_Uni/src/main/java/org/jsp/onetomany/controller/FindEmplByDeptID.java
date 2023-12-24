package org.jsp.onetomany.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Employee;

public class FindEmplByDeptID {
	
	public static void main(String[] args) {
		String qry="select d.emps from Department d where d.id=?1";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department Id to fetch Employee details");
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		List<Employee> emps = q.getResultList();
		
		if(emps.size()>0) {
			for (Employee e : emps) {
				System.out.println(e);
				
			}
		}
		else {
			System.err.println("Invalid Department ID");
		}
		
	}

}
