package org.jsp.userproductapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.userproductapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public User registerUser(User u) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(u);
		transaction.begin();
		transaction.commit();
		return u;
	}

	public User updateUser(User u) {
		EntityTransaction transaction = manager.getTransaction();
		User db = manager.find(User.class, u.getId());
		if (db != null) {
			db.setName(u.getName());
			db.setEmail(u.getEmail());
			db.setPassword(u.getPassword());
			db.setPhone(u.getPhone());
			manager.persist(db);
			transaction.begin();
			transaction.commit();
			return db;
		}
		return null;
	}
	public User verify(long phone , String password) {
		String qry = "select u from User u where u.phone=?1 and u.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		return (User)q.getSingleResult();
	}
	public User verify(String email , String password) {
		String qry = "select u from User u where u.email=?1 and u.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, email);
		q.setParameter(2, password);
		return (User)q.getSingleResult();
	}
}
