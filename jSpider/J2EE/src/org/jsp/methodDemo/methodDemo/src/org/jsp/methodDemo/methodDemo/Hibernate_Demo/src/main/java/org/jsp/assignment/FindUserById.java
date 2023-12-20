package org.jsp.assignment;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.jsp.hibernatedemo.User;

public class FindUserById {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the id to find the user ");
		int id = sc.nextInt();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		User u =s.get(User.class, id);
		if(u!=null) {
			System.out.println("User id" +u.getId());
			System.out.println("user name:" +u.getName());
			System.out.println("User email: "+u.getEmail());
			System.out.println("User Phone: "+u.getPhone());
		}
		else {
			System.err.println("you have entered Invalid User Id");
		}
		
		
	}
}
