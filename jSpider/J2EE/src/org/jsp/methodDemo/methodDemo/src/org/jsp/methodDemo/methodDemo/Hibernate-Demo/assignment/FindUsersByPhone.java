package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FindUsersByPhone {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Phone number to print the details");
		long phone = sc.nextLong();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u from User u where phone=:phone";
		Query<User> q =  s.createQuery(hql);
		q.setParameter("phone", phone);
	try {
		User u = q.getSingleResult();
		System.out.println("User ID: "+u.getId());
		System.out.println("User Name: "+u.getName());
		System.out.println("User Email "+u.getEmail());
		System.out.println("User Phone: "+u.getPhone());
		
	}
	catch(NoResultException e) {
		System.out.println("No User Found...");
	}
		
		
	}

}
