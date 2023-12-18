package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class LoadDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println("Enter the User id to print the details");
		int id = sc.nextInt();
		User u = s.load(User.class, id);
		
		try {
			
			System.out.println("User Name: "+u.getName());
			System.out.println("User id: "+u.getId());
			System.out.println("User Phone: "+u.getPhone());
			System.out.println("user Email: "+u.getEmail());
			
		}
		catch(ObjectNotFoundException e) {
			System.out.println("You have entered InValide user Id");
			
		}
	}
}
