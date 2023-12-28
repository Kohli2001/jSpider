package org.jsp.manytomanybi.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanybi.dto.Batch;

public class FindBatchesByStudentId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Id to find the batches");
		int id = sc.nextInt();
		
		String qry="select batches from Student s where s.id=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		List<Batch> batches = q.getResultList();
		if(batches.size()>0) {
			System.out.println(batches);
		}
		else {
			System.err.println("Invalid Students Id");
		}
	}

}
