package org.jsp.jpaassignment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllNames {
	
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String jpql="select m.name from Merchant m";
		Query q = manager.createQuery(jpql);
		List<String> names = q.getResultList();
		
		for(String n: names) {
			System.out.println("Merchant Names:" +n);
			System.out.println("-----------------------------");
		}
	}

}
