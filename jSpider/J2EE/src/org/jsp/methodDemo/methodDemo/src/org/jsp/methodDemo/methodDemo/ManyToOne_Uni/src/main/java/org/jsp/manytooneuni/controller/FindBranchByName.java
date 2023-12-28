package org.jsp.manytooneuni.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytooneuni.dto.Branch;

public class FindBranchByName {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the Branch name to fetch the Branch");
		String name =sc.nextLine();
		
		String qry = "select b from  Branch b where b.name=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Branch> b = q.getResultList();
		
		if(b.size()>0) {
			for (Branch branches: b) {
				System.out.println(branches);
				
			}
		}
	}

}
