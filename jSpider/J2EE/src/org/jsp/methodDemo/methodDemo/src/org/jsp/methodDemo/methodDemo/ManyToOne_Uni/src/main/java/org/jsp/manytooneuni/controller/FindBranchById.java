package org.jsp.manytooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytooneuni.dto.Branch;

public class FindBranchById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the branch id to find the details");
		
		int id = sc.nextInt();
		String qry = "select b  from Branch b where b.id=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Branch b = (Branch)q.getSingleResult();
			System.out.println(b);
		}
		catch(NoResultException e) {
			System.err.println("Invalid Branch ID");
		}
		
		
	}
}
