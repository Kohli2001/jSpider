package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchPhoneByEmail {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user Email to fetch the Phone number");
		String email = sc.next();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u.phone from User u where u.email=:email";
		Query<Long> q = s.createQuery(hql);
		q.setParameter("email", email);
		
		try {
			long phone = q.getSingleResult();
			System.out.println("User Phone Number: "+phone);
			System.out.println("----------------------");
			
		}
		catch(NoResultException e) {
			System.out.println("NO Such data is present...!");
			
		}
	}

}
