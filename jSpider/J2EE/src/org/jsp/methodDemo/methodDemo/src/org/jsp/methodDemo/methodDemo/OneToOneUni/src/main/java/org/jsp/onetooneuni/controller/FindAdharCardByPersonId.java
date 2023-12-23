package org.jsp.onetooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.AdharCard;

public class FindAdharCardByPersonId {
	
	public static void main(String[] args) {
		String qry="select p.card from Person p where p.id=?1";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person Id to fetch the Adhar card");
		int id = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
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
