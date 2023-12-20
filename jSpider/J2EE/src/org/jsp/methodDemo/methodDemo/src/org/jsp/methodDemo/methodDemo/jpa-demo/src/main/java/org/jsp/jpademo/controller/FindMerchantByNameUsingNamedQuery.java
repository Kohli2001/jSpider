package org.jsp.jpademo.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantByNameUsingNamedQuery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant Name to fetch the details");
		String name = sc.next();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Query q = manager.createNamedQuery("findbyname");
		q.setParameter(1, name);
		
		List<Merchant> merchants = q.getResultList();
		if(merchants.size()>0) {
			for (Merchant m : merchants) {
				System.out.println("Merchant ID: "+m.getId());
				System.out.println("Merchant Name: "+m.getName());
				System.out.println("Merchant Phone: "+m.getPhone());
				System.out.println("Merchant Email: "+m.getEmail());
				System.out.println("Merchant Gst Number: "+m.getGt_number());
				System.out.println("-----------------------------------------------");
				
			}
		}
		else {
			System.err.println("Invalid merchant named entered..!");
		}
		
		
	}
}
