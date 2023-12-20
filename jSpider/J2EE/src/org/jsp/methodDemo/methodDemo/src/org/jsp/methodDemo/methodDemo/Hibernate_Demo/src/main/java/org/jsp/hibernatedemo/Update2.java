package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update2 {

	public static void main(String[] args) {
		//using SaveOrUpdate()
		
		Scanner sc = new Scanner(System.in);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println("Enter the User Id to update the record");
		int id = sc.nextInt();
		User u = new User();
		
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		s.saveOrUpdate(u);
		Transaction t = s.beginTransaction();
		t.commit();
	}
}
