package org.jsp.onetomany.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Department;

public class FindDeptByName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Department Name to fetch the details");
		String name = sc.next();
		String qry ="select d from Department d where d.name=?1";
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Department> depts = q.getResultList();
		if(depts.size()>0) {
			for (Department d : depts) {
				
				System.out.println("Department ID: "+d.getId());
				System.out.println("Department Name:"+d.getName());
				System.out.println("Department Location:"+d.getLocation());
				
			}
		}
		else {
			System.err.println("Invalid Department Name...");
		}
		
	}

}
