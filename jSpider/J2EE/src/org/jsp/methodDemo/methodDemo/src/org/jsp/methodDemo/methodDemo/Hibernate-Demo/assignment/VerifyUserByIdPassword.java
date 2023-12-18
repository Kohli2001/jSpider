package org.jsp.assignment;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.hibernatedemo.User; 

public class VerifyUserByIdPassword {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Id and Password To verify the User");
		int id = sc.nextInt();
		String password= sc.next();
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u from User u where u.id=:id and u.password=:password";
		Query<User> q = s.createQuery(hql);
		
		q.setParameter("id", id);
		q.setParameter("password", password);
		
		try {
			User u = q.getSingleResult();
			System.out.println("User Verify Successfully.....!");
			System.out.println("User Id " +u.getId());
			System.out.println("User Name " +u.getName());
			System.out.println("User Email " +u.getEmail());
			System.out.println("User Phone "+u.getPhone());
		}
		catch(NoResultException e) {
		System.err.println("Invalid User ID or Password.....!");
		
	}

}
}
