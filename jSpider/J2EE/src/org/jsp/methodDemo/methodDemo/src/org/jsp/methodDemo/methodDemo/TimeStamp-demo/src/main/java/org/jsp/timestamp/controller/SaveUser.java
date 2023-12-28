package org.jsp.timestamp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.timestamp.dto.User;
import org.jsp.timestamp.dto.UserId;

public class SaveUser {

	public static void main(String[] args) {
		UserId userId = new UserId();
		userId.setEmail("kamlesh@gmail.com");
		userId.setPhone(1239);

		User u = new User();
		u.setId(userId);
		u.setName("Kamlesh");
		u.setPassword("Kamlesh@123");

		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		manager.persist(u);
		transaction.begin();
		transaction.commit();
		System.out.println("user saved successfully");

	}
}
