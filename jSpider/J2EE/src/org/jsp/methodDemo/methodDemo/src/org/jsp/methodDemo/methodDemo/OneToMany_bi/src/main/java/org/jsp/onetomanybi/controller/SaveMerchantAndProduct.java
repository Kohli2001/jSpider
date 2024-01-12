package org.jsp.onetomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanybi.dto.Merchant;
import org.jsp.onetomanybi.dto.Product;

public class SaveMerchantAndProduct {

	
	public static void main(String[] args) {
		Merchant m = new Merchant();
		m.setGts_number("KAML1324");
		m.setName("Kunal");
		m.setPassword("Kunal@123");
		m.setPhone(84724627L);
		
		Product p1 = new Product();
		p1.setBrand("HP");
		p1.setName("Laptops");
		p1.setCost(55000.00);
		p1.setMerchant(m);
		
		Product p2 = new Product();
		p2.setBrand("LENEVO");
		p2.setName("Laptops");
		p2.setCost(45000.00);
		p2.setMerchant(m);
		
		List<Product> products= new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		
		m.setProducts(products);
		
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(m);
		t.begin();
		t.commit();
		
		
		
	}
}
