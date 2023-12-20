package org.jsp.jpademo.controller;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindAllMerchants {
	public static void main(String[] args) {
		String jpql="select m from Merchant m";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(jpql);
		List<Merchant> merchants = q.getResultList();
		
		for(Merchant m : merchants) {
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
			
			System.out.println("-------------------------------------------------------");
		}
		
		
	}

}
