package org.jsp.admin.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.admin.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

	@Autowired
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	public Admin saveAdmin(Admin a) {
		
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(a);
		transaction.begin();
		transaction.commit();
		return a;
	}
	public Admin findById(int id) {
		return manager.find(Admin.class, id);
	}
	
}
