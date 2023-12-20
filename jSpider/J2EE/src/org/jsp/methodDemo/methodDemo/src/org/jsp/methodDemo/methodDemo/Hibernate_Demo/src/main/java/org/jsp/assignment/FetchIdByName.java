package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FetchIdByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name to fetch the User Id");
		String name = sc.next();
		String hql="select u.id from User u where u.name=:name";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<Integer> q = s.createQuery(hql);
		q.setParameter("name", name);
		List<Integer> users = q.getResultList();
		
		if(users.size()>0) {
			
			for(Integer id : users){
				System.out.println("User Id: "+id);
				System.out.println("----------------------------------------");
			}
		}
		else {
			System.out.println("There is not User present...");
		}
		
		
		
	}

}
