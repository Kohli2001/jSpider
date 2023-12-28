package org.jsp.timestamp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.timestamp.dto.FoodOrder;

public class UpdateOrder {
public static void main(String[] args) {
	EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction t = manager.getTransaction();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the food_order id to chnage the food item name");
	int id=sc.nextInt();
	
	FoodOrder order=manager.find(FoodOrder.class, id );
	order.setFood_item("paneer");
	t.begin();
	t.commit();
	

	
}
}
