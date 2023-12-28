package org.jsp.timestamp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.timestamp.dto.FoodOrder;

public class PlaceOrder {

	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		FoodOrder order = new FoodOrder();
		order.setAddress("SH-55, Hardia, Begusarai, Bihar-851131");
		order.setFood_item("Daal Bhat chokha");
		order.setCost(120.00);

		manager.persist(order);
		transaction.begin();
		transaction.commit();
		System.out.println("Your order has been placed With id.." + order.getId());
	}
}
