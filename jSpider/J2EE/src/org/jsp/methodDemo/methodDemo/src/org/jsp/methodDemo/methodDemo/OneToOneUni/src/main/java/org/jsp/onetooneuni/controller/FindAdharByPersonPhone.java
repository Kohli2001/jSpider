package org.jsp.onetooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.AdharCard;

public class FindAdharByPersonPhone {

	public static void main(String[] args) {
		String qry="select p.card from Person p where p.phone=?1";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person Phone to fetch the Adhar card");
		long phone = sc.nextLong();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		
		try {
			AdharCard card = (AdharCard)q.getSingleResult();
			System.out.println("Adhar ID: "+card.getId());
			System.out.println("Adhar Number: "+card.getNumber());
			System.out.println("Date Of Birth: "+card.getDob());
			System.out.println("Address: "+card.getAddress());
			
		}
		catch(NoResultException e) {
			System.err.println("Invalid phone number");
		}
	}

}
