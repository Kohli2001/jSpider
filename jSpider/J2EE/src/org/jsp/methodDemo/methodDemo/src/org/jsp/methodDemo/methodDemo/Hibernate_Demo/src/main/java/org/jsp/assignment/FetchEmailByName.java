package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchEmailByName {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name to fetch Emails");
		String name = sc.next();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u.email from User u where u.name=:name";
		Query<String> q = s.createQuery(hql);
		q.setParameter("name", name);
		List<String> names= q.getResultList();
		
		for(String email:names) {
			System.out.println("User Email:"+email);
			System.out.println("-------------------");
		}
	}
}
