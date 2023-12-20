package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class SaveMerchant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the merchant name, phone, email, gst number and create password to save the merchant");
		Merchant m = new Merchant();
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setGt_number(sc.next());
		m.setPassword(sc.next());

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		manager.persist(m);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		
		System.out.println("Merchant registered with id: "+m.getId());
	}

}
