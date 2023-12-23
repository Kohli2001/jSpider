package org.jsp.onetooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.Person;

public class FindPersonByAdharId {

	public static void main(String[] args) {
		String qry = "select p from Person p where p.card.id=?1";
		System.out.println("Enter the adhar card id to fetch the person ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Person p  = (Person)q.getSingleResult();
			System.out.println("Person Id: "+p.getId());
			System.out.println("Person Name: "+p.getName());
			System.out.println("Person Age: "+p.getAge());
			System.out.println("Person Phone: "+p.getPhone());
		}
		catch(NoResultException e) {
			System.err.println("Invalid Adhar Card Id...");
			
		}
		
	}
}
