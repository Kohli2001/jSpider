package org.jsp.merchantproductapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.merchantproductapp.dto.Merchant;
import org.jsp.merchantproductapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	@Autowired
	private EntityManager manager;
	
	public Product addProduct(Product p) {
		manager.persist(p);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		return p;
	}

	public Product findProByUserId(int id) {
		String qry = "select u.products from User u where u.id=?1";
		Query q = manager.createQuery(qry);
		q.setParameter(1, id);
		return (Product) q.getSingleResult();
	}

	public List<Product> findProByBrand(String brand) {
		Query q = manager.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, brand);
		return q.getResultList();
	}

	public List<Product> findProByCategory(String category) {
		Query q = manager.createQuery("select p from Product p where p.category=?1");
		q.setParameter(1, category);
		return q.getResultList();
	}

	public Merchant findUserByProId(int id) {
		Query q = manager.createQuery("select p.merchants from Product p where p.id=?1");
		q.setParameter(1, id);
		return (Merchant) q.getSingleResult();

	}
	

}
