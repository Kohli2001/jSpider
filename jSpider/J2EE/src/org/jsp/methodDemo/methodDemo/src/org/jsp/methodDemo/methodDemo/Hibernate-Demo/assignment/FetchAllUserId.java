package org.jsp.assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FetchAllUserId {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u.id from User u";
		Query<Integer> q = s.createQuery(hql);
		List<Integer> users = q.getResultList();
		for(Integer id :users) {
			System.out.println("User Id: "+id);
			System.out.println("--------------------------");
		}
		
	}

}
