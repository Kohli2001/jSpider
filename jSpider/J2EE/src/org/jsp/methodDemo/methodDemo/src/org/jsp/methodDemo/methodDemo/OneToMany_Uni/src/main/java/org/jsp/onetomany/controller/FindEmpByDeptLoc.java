package org.jsp.onetomany.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomany.dto.Employee;

public class FindEmpByDeptLoc {

	public static void main(String[] args) {
		String qry="select d.emps from Department d where d.location=?1";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department name to fetch Employee details");
		String name = sc.nextLine();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Employee> emps = q.getResultList();
		
		if(emps.size()>0) {
			for (Employee e : emps) {
				System.out.println(e);
				
			}
		}
		else {
			System.err.println("Invalid Departement Locations");
		}
		
	}
}
