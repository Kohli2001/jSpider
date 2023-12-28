package org.jsp.manytooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytooneuni.dto.Hospital;

public class FindHopistalById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the hopistal Id to fetch the hospital");
		int id =sc.nextInt();
		
		String qry = "select h from  Hospital h where h.id=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Hospital h = (Hospital) q.getSingleResult();
			System.out.println(h);
		}
		catch(NoResultException e) {
			System.err.println("Invalid Entred Hopistal Id");
		}
	}
}
