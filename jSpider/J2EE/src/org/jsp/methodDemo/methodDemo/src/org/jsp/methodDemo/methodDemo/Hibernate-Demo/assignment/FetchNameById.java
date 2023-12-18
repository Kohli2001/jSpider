package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchNameById {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user Id to fetch the User name");
		int id = sc.nextInt();
		String hql="select u.name from User u where u.id=:id";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<String> q = s.createQuery(hql);
		q.setParameter("id", id);
		List<String> users = q.getResultList();
		
		if(users.size()>0) {
			
			for(String name:users){
				
				System.out.println("User Name: "+name);
				System.out.println("----------------------------------------");
			}
		}
		else {
			System.out.println("There is not User present with Id."+id);
		}
		
		
		
	}

}
