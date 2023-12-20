package org.jsp.jpaassignment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllPhones {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String jpql="select m.phone from Merchant m order by m.name";
		Query q = manager.createQuery(jpql);
		List<Long> phones = q.getResultList();
		
		for(Long n: phones) {
			System.out.println("Merchant Phone Number:" +n);
			System.out.println("-----------------------------");
		}
	}
	}
