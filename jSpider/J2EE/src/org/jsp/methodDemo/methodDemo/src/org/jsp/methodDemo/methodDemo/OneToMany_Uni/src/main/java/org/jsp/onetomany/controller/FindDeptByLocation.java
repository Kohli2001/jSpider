package org.jsp.onetomany.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Department;

public class FindDeptByLocation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Department Location to fetch the Details");
		String loc = sc.nextLine();
		
		String qry="select d from Department d where d.location=?1";
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, loc);
		List<Department> dept = q.getResultList();
		
		if(dept.size()>0) {
			for (Department d : dept) {
				System.out.println("Department ID: "+d.getId());
				System.out.println("Department Name:"+d.getName());
				System.out.println("Department Location:"+d.getLocation());
				
			}
		}
		else {
			System.err.println("Invalid Location entered..!");
		}
		
	}

}
