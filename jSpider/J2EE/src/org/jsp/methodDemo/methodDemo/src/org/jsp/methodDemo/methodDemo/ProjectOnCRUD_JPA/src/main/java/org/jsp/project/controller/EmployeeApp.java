package org.jsp.project.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeApp {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		System.out.println(factory);
	}
}
