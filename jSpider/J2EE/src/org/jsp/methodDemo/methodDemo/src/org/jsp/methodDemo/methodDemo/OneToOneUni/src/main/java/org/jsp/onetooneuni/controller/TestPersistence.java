package org.jsp.onetooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestPersistence {
	
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println(manager);
	}

}
