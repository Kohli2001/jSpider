package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User id to update user");
		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		User u =s.get(User.class, id);
		if(u!=null) {
			System.out.println("Enter user name,phone,email,password to update details");
			u.setName(sc.next());
			u.setPhone(sc.nextLong());
			u.setEmail(sc.next());
			u.setPassword(sc.next());
			Transaction  t= s.beginTransaction();
			t.commit();
		}
		else {
			System.err.println("Can not update as Id is not Valid...");
		}
	}

}
