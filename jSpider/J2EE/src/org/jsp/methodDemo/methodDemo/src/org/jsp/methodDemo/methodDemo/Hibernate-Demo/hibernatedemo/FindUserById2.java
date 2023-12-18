package org.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class FindUserById2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id to print the details");
		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u from User u where u.id=:id";
		Query<User> q = s.createQuery(hql);
		q.setParameter("id", id);
		try {
			User u = q.getSingleResult();
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getEmail());
			System.out.println(u.getPhone());
		
		}
		catch(NoResultException e) {
			System.out.println("no user found ");
		}
		
	}
}
