package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchPhoneByName {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User name to fetch phone number");
		String name=sc.next();
		String hql="select u.phone from User u where u.name=:name";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<Long> q = s.createQuery(hql);
		q.setParameter("name", name);
		try {
			long phones = q.getSingleResult();
			System.out.println("-----------------------------");
			System.out.println("User Phone: "+phones);
			System.out.println("------------------------------");
		}
		catch(NoResultException e) {
			System.out.println("No such Data is Present in Database...");
		}
		
		
	}

}
