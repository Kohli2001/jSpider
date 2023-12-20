package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class VerifyMerchant {

	
	public static void main(String[] args) {
		System.out.println("1.verify Merchant By Phone and passowrd");
		System.out.println("2.verify Merchant By Email and passowrd");
		System.out.println("3.verify Merchant By Id and passowrd");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = null;
		
		switch (choice) {
		case 1:{
			q=manager.createNamedQuery("findbyphone");
			System.out.println("Enter Phone and password");
			q.setParameter(1, sc.nextLong());
			q.setParameter(2, sc.next());
			break;
		}
		case 2:{
			q=manager.createNamedQuery("findbyemail");
			System.out.println("Enter email and password");
			q.setParameter(1, sc.next());
			q.setParameter(2, sc.next());
			break;
		}
		case 3:{
			q=manager.createNamedQuery("findbyid");
			System.out.println("Enter Id and password");
			q.setParameter(1, sc.nextInt());
			q.setParameter(2, sc.next());
			break;
		}
		default:
			System.out.println("Invalid Choice");
			break;
		}
		try {
			
			Merchant m = (Merchant) q.getSingleResult();
			System.out.println("Verfication Successufll.....!");
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
			
		}
		catch(NoResultException e) {
			System.err.println("Invalid Credential...");
		}
	}
}
