package org.jsp.jpaassignment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant name to fetch the details");
		String name = sc.next();
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String jpql="select m from Merchant m where name=?1";
		Query q = manager.createQuery(jpql);
		q.setParameter(1, name);
		List<Merchant> merchants = q.getResultList(); 
		
		for(Merchant m: merchants) {
			System.out.println("Merchant ID: "+m.getId());
			System.out.println("Merchant Name: "+m.getName());
			System.out.println("Merchant Phone: "+m.getPhone());
			System.out.println("Merchant Email: "+m.getEmail());
			System.out.println("Merchant Gst Number: "+m.getGt_number());
			
			System.out.println("---------------------------------------------");
		}
	}

}
