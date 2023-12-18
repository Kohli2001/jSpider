package org.jsp.assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FetchAllUserPhone {

	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u.phone from User u";
		Query<Long> q = s.createQuery(hql);
		List<Long> users = q.getResultList();
		
		for (Long phone : users) {
			System.out.println("User Phone Number: "+phone);
			System.out.println("----------------------------");
			
		}
		
	}
}
