package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FindUserByEmail {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Email to print Details");
		String email = sc.next();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql = "select u from User u where email=:email";
		Query<User> q = s.createQuery(hql);
		q.setParameter("email", email);
		try {
			User u = q.getSingleResult();
			System.out.println("User Id: "+u.getId());
			System.out.println("User Name: "+u.getName());
			System.out.println("User Email "+u.getEmail());
			System.out.println("User Phone: "+u.getPhone());
			
		}
		catch(NoResultException e) {
			System.out.println("No User Found...");
		}
		
		
		
	}
}
