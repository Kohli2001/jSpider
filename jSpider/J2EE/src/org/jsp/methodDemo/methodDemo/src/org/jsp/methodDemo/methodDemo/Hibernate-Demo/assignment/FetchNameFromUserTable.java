package org.jsp.assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FetchNameFromUserTable {
	
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql = "select u.name from User u";
		Query<String> q = s.createQuery(hql);
		List<String> users = q.getResultList();
		for(String name: users) {
			System.out.println("user Name: "+ name);
			System.out.println("----------------------------");
		}
		
	}
}
