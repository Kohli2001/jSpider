package org.jsp.onetooneuni.controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.Person;

public class FindPersonByDobAndNumber {
	
	public static void main(String[] args) {
		String qry = "select p from Person p where p.card.number=?1 and p.card.dob=?2";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the person adhar number and DOB(YYY-MM-DD) to fetch the details");
		long number = sc.nextLong();
		LocalDate dob = LocalDate.parse(sc.next());
		Query q = manager.createQuery(qry);
		q.setParameter(1, number);
		q.setParameter(2, dob);
		
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
