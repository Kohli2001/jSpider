package org.jsp.jpademo.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantByPhoneUsingNativeQuery {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone to fetch the merchant");
		long phone = sc.nextLong();
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		String sql="select * from Merchant where phone=?";
		Query q = manager.createNativeQuery(sql, Merchant.class);
		q.setParameter(1, phone);
		
		List<Merchant> merchants = q.getResultList();
		for(Merchant m :merchants ) {
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
			System.out.println("------------------------------------------------");
		}
	}
	

}
