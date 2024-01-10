package org.jsp.hibernatetemplatedemo.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.sql.Template;
import org.jsp.hibernatetemplatedemo.dao.ProductDao;
import org.jsp.hibernatetemplatedemo.dto.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductController {

	static ProductDao dao;
	static Scanner sc = new Scanner(System.in);

	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("product-cfg.xml");
		dao = context.getBean(ProductDao.class);
	}
	
	public static void main(String[] args) {
		
//		boolean flag = true;
		while(true) {
		System.out.println("=======================Product App=========================");
		System.out.println("1.Add Product\n2.Update Product\n3.Find Product By Id\n4.Find All Product\n5.Delete Product\n6.Exit");
		System.out.println("---------------------------------------------------");
		System.out.println("Enter your Choice");
		switch (sc.nextInt()) {
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			find();
			break;
		case 4:
			findAll();
			break;
		case 5:
			delete();
			break;
		case 6:
//			flag=false;
			sc.close();
			System.exit(0);
		default:
			System.out.println("invalid choice...");
			break;
		}
		}
	}
	
	static void add() {
		System.out.println("Enter the Product name,brand, category, description and Cost to Add the product");
		Product p = new Product();
		p.setName(sc.next());
		p.setBrand(sc.next());
		p.setCategory(sc.next());
		p.setDescription(sc.next());
		p.setCost(sc.nextDouble());
		dao.saveProduct(p);
		System.out.println("Product Successfully added with id: "+p.getId());
	}
	static void update() {
		System.out.println("enter the Product id to update");
		int id = sc.nextInt();
		System.out.println("Enter the Product name,brand, category, description and Cost to Add the product");
		Product p = new Product();
		p.setId(id);
		p.setName(sc.next());
		p.setBrand(sc.next());
		p.setCategory(sc.next());
		p.setDescription(sc.next());
		p.setCost(sc.nextDouble());
		Product pro = dao.updateProduct(p);
		if(pro!=null)
		System.out.println("Product with id:" +id+ "updated");
		else
			System.out.println("Invalid Entered product Id");
		
	}
	static void find() {
		System.out.println("Enter the Product Id to Get the product");
		int id = sc.nextInt();
		Product p = dao.findById(id);
		if(p!=null) {
			System.out.println(p);
		}
		else {
			System.err.println("Invalid Product Id");
			
		}
			
	}
	static void findAll() {
		List<Product> products = dao.findAll();
		if(products!=null) {
			System.out.println(products);
		}
		else
		System.err.println("No Product present in DB..");
	}
	static void delete() {
		System.out.println("Enter the Product Id to delete the product ");
		int id = sc.nextInt();
		boolean flag = dao.deleteProduct(id);
		if(flag) {
			System.out.println("Product deleted succesfully...");
		}
		System.err.println("Enter inavlid product Id");
	}
	
}
