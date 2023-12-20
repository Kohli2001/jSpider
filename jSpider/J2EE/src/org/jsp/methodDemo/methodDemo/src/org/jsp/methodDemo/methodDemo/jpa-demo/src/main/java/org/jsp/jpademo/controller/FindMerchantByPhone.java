package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantByPhone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jpql="select m from Merchant m where m.phone=?1";
		System.out.println("Enter the merchant's Phone number to fetch the data ");
		long phone = sc.nextLong();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(jpql);
		q.setParameter(1, phone);
		
		try {
			Merchant m =(Merchant)q.getSingleResult();
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
		}
		catch(NoResultException e) {
			System.err.println("Invalid Phone number");
		}
	}

}
