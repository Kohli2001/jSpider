package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		System.out.println("Enter your name,phone,email,and password to save");
		u.setName(sc.next());
		u.setPhone(sc.nextLong());
		u.setEmail(sc.next());
		u.setPassword(sc.next());
		System.out.println("Id before Saving User " +u.getId());
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		int id = (Integer)s.save(u);
		t.commit();
		System.out.println("Id after saved with id: "+id);
		
	}

}
