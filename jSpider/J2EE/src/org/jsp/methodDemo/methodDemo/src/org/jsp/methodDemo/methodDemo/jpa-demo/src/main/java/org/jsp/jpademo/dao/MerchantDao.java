package org.jsp.jpademo.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class MerchantDao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transcation = manager.getTransaction();
	Scanner sc = new Scanner(System.in);
	
	
		public void save(Merchant m) {
		manager.persist(m);
		transcation.begin();
		transcation.commit();
		System.out.println("Merchant Saved Successfully...!");
	
	}
	

}
