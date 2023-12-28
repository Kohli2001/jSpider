package org.jsp.manytooneuni.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytooneuni.dto.Hospital;

public class FindHospitalByName {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the hopistal name to fetch the hospital");
		String name =sc.nextLine();
		
		String qry = "select h from  Hospital h where h.name=?1";
		EntityManager manager= Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, name);
		
		List<Hospital> h = q.getResultList();
		
		if(h.size()>0) {
			for (Hospital hospitals : h) {
				System.out.println(hospitals);
				
			}
		}
	}

}
