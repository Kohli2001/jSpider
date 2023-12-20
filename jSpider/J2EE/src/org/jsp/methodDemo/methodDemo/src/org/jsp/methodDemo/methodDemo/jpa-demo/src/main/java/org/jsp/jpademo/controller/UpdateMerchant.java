package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class UpdateMerchant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant ID to Update");
		int id = sc.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Merchant m = manager.find(Merchant.class, id);
		if (m != null) {
			System.out.println(
					"Enter the merchant name, phone, email, gst number and create password to save the merchant");
			m.setName(sc.next());
			m.setPhone(sc.nextLong());
			m.setEmail(sc.next());
			m.setGt_number(sc.next());
			m.setPassword(sc.next());
			manager.persist(m);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
		}
		else {
			System.err.println("Can not update as entered id is Invalid..!");
		}

	}

}
