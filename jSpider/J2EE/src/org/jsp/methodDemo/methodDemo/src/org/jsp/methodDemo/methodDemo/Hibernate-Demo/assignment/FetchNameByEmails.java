package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchNameByEmails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email to fetch the User names");
		String email= sc.next();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		String hql="select u.name from User u where u.email=:email";
		Query<String> q = s.createQuery(hql);
		q.setParameter("email", email);
		try {
			String names=q.getSingleResult();
			System.out.println("User Name: "+names);
			System.out.println("---------------------");
			
		}catch(NoResultException e){
			System.err.println("No Such User present with this email "+email);
			
		}
	}

}
