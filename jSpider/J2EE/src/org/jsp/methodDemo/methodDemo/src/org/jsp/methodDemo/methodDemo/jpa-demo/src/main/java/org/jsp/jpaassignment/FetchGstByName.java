package org.jsp.jpaassignment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchGstByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant name to fetch the Gst Number");
		String name = sc.next();
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String jpql="select m.gt_number from Merchant m where m.name=?1";
		Query q = manager.createQuery(jpql);
		q.setParameter(1, name);
		
		List<String> gsts = q.getResultList();
		for(String gst: gsts) {
			System.out.println("Gst Number: "+gst);
			System.out.println("--------------------------------");
		}
	}
}
