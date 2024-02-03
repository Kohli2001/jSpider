package org.jsp.userproductapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.userproductapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Product addProduct(Product p) {
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		return p;
	}
	public List<Product> findByBrand(String brand){
		String qry ="select p from Product p where p.brand=?1";
		Query q = manager.createQuery(qry);
		q.setParameter(1, brand);
		return q.getResultList();
	}
	public List<Product> findByCategory(String category){
		String qry ="select p from Product p where p.category=?1";
		Query q = manager.createQuery(qry);
		q.setParameter(1, category);
		return q.getResultList();
	} 

}
