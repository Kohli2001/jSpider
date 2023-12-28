package org.jsp.manytooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytooneuni.dto.Branch;
import org.jsp.manytooneuni.dto.Hospital;

public class SaveHopistalAndBranches {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Hospital h = new Hospital();
		h.setName("Sparsa");
		h.setFounder("DR. Michtel Soutt");
		h.setYear_of_estb(1987);

		Branch b1 = new Branch();
		b1.setName("Sparsa Bangalore");
		b1.setPhone(887788882626L);
		b1.setEmail("sparcha@bang.ac.in");
		b1.setHospital(h);

		Branch b2 = new Branch();
		b2.setName("Sparsa Maysore");
		b2.setPhone(8877888L);
		b2.setEmail("sparcha@maysore.ac.in");
		b2.setHospital(h);

		Branch b3 = new Branch();
		b3.setName("Sparsa combaitore");
		b3.setPhone(887788881512L);
		b3.setEmail("sparcha@comb.ac.in");
		b3.setHospital(h);

		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);

		transaction.begin();
		transaction.commit();
	}
}
