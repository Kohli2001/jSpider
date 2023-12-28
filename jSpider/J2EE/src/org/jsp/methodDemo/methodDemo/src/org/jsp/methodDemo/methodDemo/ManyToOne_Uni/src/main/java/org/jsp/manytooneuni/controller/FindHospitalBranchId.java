package org.jsp.manytooneuni.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytooneuni.dto.Hospital;

public class FindHospitalBranchId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Branch Id to fetch the Hospital details");
		int id = sc.nextInt();
		String qry="select b.hospital from Branch b where b.id=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		
		try {
			Hospital h = (Hospital)q.getSingleResult();
			System.out.println("Hospital id: "+h.getId());
			System.out.println("Hospital Name: "+h.getName());
			System.out.println("Hospital Founder"+h.getFounder());
		}
		catch (NoResultException e) {
			System.err.println("Invalid Id ENTERED..");
		}
		
	}

}
