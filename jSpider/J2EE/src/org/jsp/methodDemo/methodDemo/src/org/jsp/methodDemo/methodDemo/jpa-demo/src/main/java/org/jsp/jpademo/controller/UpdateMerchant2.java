package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class UpdateMerchant2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter merchant Id to update");
		int id = sc.nextInt();
		System.out.println("Enter the name,phone, email,gst number and password to update");
		Merchant m =new Merchant();
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setGt_number(sc.next());
		m.setPassword(sc.next());
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		m =manager.merge(m);
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		transcation.commit();
		System.out.println("Merchnat has be Updated with Id: "+m.getId());
		sc.close();
		
	}
}
