package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantById {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the merchant ID to find the Merchnat");
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Merchant m = manager.find(Merchant.class, id);
		if(m!=null) {
			System.out.println("Merchant Id: "+m.getId());
			System.out.println("Merchant Nmae: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
			
		}
		else {
			System.err.println("Invalid Merchant id..");
		}
		sc.close();
	}
}
