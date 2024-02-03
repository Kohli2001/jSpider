package org.jsp.singuploginapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.singuploginapp.dto.User;
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

	public User register(User u) {
	    EntityTransaction transaction = manager.getTransaction();
	    
	    manager.persist(u);
	    transaction.begin();
	    transaction.commit();
	    return u;
	}


//	public User login(String email, String password) {
//		String qry ="select u from User u where u.email=?1 and u.password=?2";
//		Query q = manager.createQuery(qry);
//		q.setParameter(1, email);
//		q.setParameter(2, password);
//		return (User)q.getSingleResult();
//				
//	}
//	public User login(long phone, String password) {
//		String qry ="select u from User u where u.phone=?1 and u.password=?2";
//		Query q = manager.createQuery(qry);
//		q.setParameter(1, phone);
//		q.setParameter(2, password);
//		return (User)q.getSingleResult();		
//	}
	
}
