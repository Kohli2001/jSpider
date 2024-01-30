package org.jsp.springusermvcapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.springusermvcapp.dto.User;
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
	
	public User saveUser(User u) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(u);
		transaction.begin();
		transaction.commit();
		return u;
	}
	public User updateUser(User u) {
		EntityTransaction transaction = manager.getTransaction();
		User userDb = manager.find(User.class, u.getId());
		if(userDb!=null) {
			userDb.setName(u.getName());
			userDb.setAge(u.getAge());
			userDb.setEmail(u.getEmail());
			userDb.setGender(u.getGender());
			userDb.setPhone(u.getPhone());
			userDb.setPassword(u.getPassword());
			manager.persist(userDb);
			transaction.begin();
			transaction.commit();
			return userDb;
		}
		return null;
		
		
	}
	public User findUserById(int id) {
		return manager.find(User.class, id);
	}
	
	public boolean deleteUserById(int id) {
		EntityTransaction transaction = manager.getTransaction();
		User u = manager.find(User.class, id);
		if(u!= null) {
			manager.remove(u);
			transaction.begin();
			transaction.commit();
			return true;
			
		}
		return false;
	}
	public User verifyUser(int id, String password) {
		String qry="select u from User u where u.id=?1 and u.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		q.setParameter(2, password);
		try {
			return (User)q.getSingleResult();
		}
		catch(NoResultException e) {
			return null;
		}
		
		
	}
	public User verifyUser(String email, String password) {
		String qry="select u from User u where u.email=?1 and u.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, email);
		q.setParameter(2, password);
		try {
			return (User)q.getSingleResult();
		}
		catch(NoResultException e) {
//			System.err.println("No Such result found");
			return null;
		}
		
	}
	public User verifyUser(long phone, String password) {
		String qry="select u from User u where u.phone=?1 and u.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
			return (User)q.getSingleResult();
		}
		catch(NoResultException e) {
//			System.err.println("No Such result found");
			return null;
		}
		
	}
	
	
	

}
