package org.jsp.hibernatetemplatedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.hibernatetemplatedemo.dto.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProductDao {

	private HibernateTemplate template;

	@Transactional
	public Product saveProduct(Product p) {
		template.save(p);
		return p;
	}

	@Transactional
	public Product updateProduct(Product p) {
		Product pDb = template.get(Product.class, p.getId());
		if (pDb != null) {
			pDb.setBrand(p.getBrand());
			pDb.setCategory(p.getCategory());
			pDb.setCost(p.getCost());
			pDb.setDescription(p.getDescription());
			pDb.setName(p.getName());
			template.update(pDb);
			return pDb;
		}
		return null;

	}

	public Product findById(int id) {
		return template.get(Product.class, id);

	}

	public List<Product> findAll() {
		return template.loadAll(Product.class);
	}

	@Transactional
	public boolean deleteProduct(int id) {
		Product p = template.get(Product.class, id);
		if (p != null) {
			template.delete(p);
			return true;
		}
		return false;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
}
