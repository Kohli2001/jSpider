package org.jsp.onetomany.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Department;

public class FindDepatById {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the department Id to fetch Department");
		int id = sc.nextInt();
		String qry = "select d from Department d where d.id=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query  q= manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Department d = (Department)q.getSingleResult(); 
			System.out.println("Department ID: "+d.getId());
			System.out.println("Department Name:"+d.getName());
			System.out.println("Department Location:"+d.getLocation());
			
		}
		catch (NoResultException e) {
			System.err.println("Invalid Department ID "+id);
		}
		
	}

}
