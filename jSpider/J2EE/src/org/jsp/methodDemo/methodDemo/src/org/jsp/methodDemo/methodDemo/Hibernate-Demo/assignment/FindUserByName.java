package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User;

public class FindUserByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name to print the details");
		String name = sc.nextLine();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql = "select u from User u where u.name=:name";
		Query<User> q = s.createQuery(hql);
		q.setParameter("name", name);
		List<User> users = q.getResultList();
		for(User u: users) {
			System.out.println("User ID: "+u.getId());
			System.out.println("User Name: "+u.getName());
			System.out.println("User Email" +u.getEmail());
			System.out.println("User Phone: "+u.getPhone());
			System.out.println("------------------------------");
		}
		
	}
}
