package org.jsp.onetooneuni.controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.AdharCard;

public class FindAdharByPersonNumberAndDob {
	
	public static void main(String[] args) {
		String qry="select p.card from Person p where p.card.number=?1 and p.card.dob=?2";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person Adhar Number and date of birth(YYYY-MM-DD)");
		long number= sc.nextLong();
		LocalDate dob= LocalDate.parse(sc.next());
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		
		q.setParameter(1, number);
		q.setParameter(2, dob);
		
		try {
			AdharCard card = (AdharCard)q.getSingleResult();
			System.out.println("Adhar ID: "+card.getId());
			System.out.println("Adhar Number: "+card.getNumber());
			System.out.println("Date Of Birth: "+card.getDob());
			System.out.println("Address: "+card.getAddress());
			
		}
		catch(NoResultException e) {
			System.err.println("Invalid Id");
		}
	}

}
