package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchNameByPhone {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number to fetch the Name");
		
		long phone = sc.nextLong();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u.name from User u where u.phone=:phone";
		Query<String> q = s.createQuery(hql);
		q.setParameter("phone", phone);
		try {
			String names = q.getSingleResult();
			System.out.println("User Names: "+names);
			System.out.println("----------------------------------");
	}
	catch(NoResultException e) {
		System.out.println("No such user present in the table..");
	}

}
}
