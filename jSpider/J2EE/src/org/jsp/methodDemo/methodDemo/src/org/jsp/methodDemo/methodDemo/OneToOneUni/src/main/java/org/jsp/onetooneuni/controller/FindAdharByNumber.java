package org.jsp.onetooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.AdharCard;

public class FindAdharByNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the adhar number to find Adhr ");
		long number = sc.nextLong();
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry ="select p.card from Person p where p.card.number=?1";
		Query q = manager.createQuery(qry);
		q.setParameter(1, number);
		
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
