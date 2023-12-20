package org.jsp.jpaassignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class VerifyMerchantByPhonePassowrd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Phone and Passowrd to Verify the Merchant");
		long phone = sc.nextLong();
		String password=sc.next();
		
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		String jpql ="select m from Merchant m where m.phone=?1 and m.password=?2";
		Query q = manager.createQuery(jpql);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		
		try {
			Merchant m =(Merchant) q.getSingleResult();
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
		}
		catch(NoResultException e) {
			System.out.println("Invalid Merchant Phone or Passowrd");
		}
	}

}
