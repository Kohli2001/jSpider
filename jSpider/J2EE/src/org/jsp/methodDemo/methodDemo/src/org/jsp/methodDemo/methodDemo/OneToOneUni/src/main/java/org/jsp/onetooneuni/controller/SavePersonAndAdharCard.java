package org.jsp.onetooneuni.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetooneuni.dto.AdharCard;
import org.jsp.onetooneuni.dto.Person;

public class SavePersonAndAdharCard {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Kamlesh");
		p.setAge(25);
		p.setPhone(8877707930l);

		AdharCard card = new AdharCard();
		card.setAddress("Begusrai, Bihar");
		card.setDob(LocalDate.parse("1999-12-16"));
		card.setNumber(1234567891612l);

		p.setCard(card);

		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(p);
		manager.persist(card);
		System.out.println("Svaed successfully...!");
		t.begin();
		t.commit();

	}

}
