package org.jsp.manytomanybi.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanybi.dto.Batch;

public class FindBatchesByStudentPhone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Id to find the batches");
		long phone = sc.nextLong();
		
		String qry="select batches from Student s where s.phone=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		List<Batch> batches = q.getResultList();
		if(batches.size()>0) {
			System.out.println(batches);
		}
		else {
			System.err.println("Invalid Students Id");
		}
	}
}
