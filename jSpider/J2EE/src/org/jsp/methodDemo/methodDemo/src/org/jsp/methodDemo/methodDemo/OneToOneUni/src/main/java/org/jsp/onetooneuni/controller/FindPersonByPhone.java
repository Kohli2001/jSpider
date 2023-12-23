package org.jsp.onetooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.Person;

public class FindPersonByPhone {
	public static void main(String[] args) {
		String qry = "select p from Person p where p.phone=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the person phone number to fetch the details");
		long phone = sc.nextLong();
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		
		try {
			Person p = (Person)q.getSingleResult();
			System.out.println("Person Id: "+p.getId());
			System.out.println("Person Name: "+p.getName());
			System.out.println("Person Age: "+p.getAge());
			System.out.println("Person Phone: "+p.getPhone());
			
			 
		}
		catch (NoResultException e) {
			System.err.println("Invalid Person Phone Number");
		}
	}

}
