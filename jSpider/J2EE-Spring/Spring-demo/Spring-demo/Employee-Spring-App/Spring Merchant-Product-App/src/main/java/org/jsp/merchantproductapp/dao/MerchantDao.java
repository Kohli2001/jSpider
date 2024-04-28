package org.jsp.merchantproductapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.merchantproductapp.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {

	@Autowired
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Merchant saveMerchant(Merchant m) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(m);
		transaction.begin();
		transaction.commit();
		return m;

	}
	public Merchant updateMerchant(Merchant m) {
		EntityTransaction transaction = manager.getTransaction();
		Merchant mdb = manager.find(Merchant.class, m.getId());
		if(mdb!=null) {
			mdb.setName(m.getName());
			mdb.setEmail(m.getEmail());
			mdb.setPassword(m.getPassword());
			mdb.setPhone(m.getPhone());
			transaction.begin();
			transaction.commit();
			return mdb;
		}
		return null;
		
	}
	
	public  Merchant findMerchantById(int id) {
		return 	manager.find(Merchant.class, id);
		
	}
	public Merchant verify(long phone, String password) {
		String qry = "select m from Merchant m where m.phone=?1 and m.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		
		return (Merchant)q.getSingleResult();
	}
	public Merchant verify(String email, String password) {
		String qry = "select m from Merchant m where m.emai=?1 and m.password=?2";
		Query q = manager.createQuery(qry);
		q.setParameter(1, email);
		q.setParameter(2, password);
		
		return (Merchant)q.getSingleResult();
	}
	
}
