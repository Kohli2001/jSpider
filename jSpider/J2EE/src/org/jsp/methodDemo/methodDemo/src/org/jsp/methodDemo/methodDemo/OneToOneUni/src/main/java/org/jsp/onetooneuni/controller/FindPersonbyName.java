package org.jsp.onetooneuni.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetooneuni.dto.Person;

public class FindPersonbyName {

	public static void main(String[] args) {
		String qry = "select p from Person p where p.name=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the person Name to fetch the details");
		String name= sc.next();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Person> names = q.getResultList();
		if(names.size()>0) {
			for (Person p : names) {
				System.out.println("Person Id: "+p.getId());
				System.out.println("Person Name: "+p.getName());
				System.out.println("Person Age: "+p.getAge());
				System.out.println("Person Phone: "+p.getPhone());
				
				System.out.println("------------------------------------------");
			}
		}
		else {
			System.out.println("No such Names Present in Person");
		}
	}
}
