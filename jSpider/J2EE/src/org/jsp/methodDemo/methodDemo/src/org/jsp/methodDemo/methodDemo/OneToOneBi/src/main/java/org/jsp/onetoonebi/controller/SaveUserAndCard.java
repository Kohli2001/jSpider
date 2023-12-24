package org.jsp.onetoonebi.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoonebi.dto.PanCard;
import org.jsp.onetoonebi.dto.User;

public class SaveUserAndCard {
	
	public static void main(String[] args) {
		User u = new User();
		u.setName("Kamlesh");
		u.setPhone(8877707939L);
		
		PanCard card = new PanCard();
		card.setNumber("KAML16122001");
		card.setDob(LocalDate.parse("1999-12-16"));
		card.setPincode(851131);
		card.setUser(u);
		
		u.setCard(card);
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		
		manager.persist(u);
		t.begin();
		t.commit();
//		System.out.println("Saved Succefully..");
		
	}

}
