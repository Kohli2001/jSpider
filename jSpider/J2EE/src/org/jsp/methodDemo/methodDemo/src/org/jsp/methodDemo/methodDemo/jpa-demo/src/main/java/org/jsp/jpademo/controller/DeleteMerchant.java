package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class DeleteMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id to delete a merchant");
		int id = sc.nextInt();
		
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Merchant m = manager.find(Merchant.class, id);
		if(m!=null) {
			manager.remove(m);
			EntityTransaction trans = manager.getTransaction();
			trans.begin();
			trans.commit();
			System.out.println("merchant deleted..!");
			
			
		}
		else {
			System.out.println("merchant not present ");
		}
		
		
		
	}

}
