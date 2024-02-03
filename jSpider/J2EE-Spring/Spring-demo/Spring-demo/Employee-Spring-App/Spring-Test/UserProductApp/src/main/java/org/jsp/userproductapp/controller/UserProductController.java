package org.jsp.userproductapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsp.userproductapp.UserProductConfig;
import org.jsp.userproductapp.dao.ProductDao;
import org.jsp.userproductapp.dao.UserDao;
import org.jsp.userproductapp.dto.Product;
import org.jsp.userproductapp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserProductController {

	private static Scanner sc = new Scanner(System.in);
	private static ProductDao pdao;
	private static UserDao udao;
	
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserProductConfig.class);
		pdao= context.getBean(ProductDao.class);
		udao =context.getBean(UserDao.class);
	}
	
	public static void main(String[] args) {
		System.out.println("1.Register User\n2.Update User\n3.Verify User by Phone & password\n4Verify User By Email & Password"
				+ "\n5.Add Product\n6.Find Product By Brand\n7.Find Product By Category");
		
		System.out.println("enter your choice");
		switch (sc.nextInt()) {
		case 1:
			register();
			
			break;
		case 2:
			update();
			break;
		case 3:
			verifyByPhone();
			break;
		case 4:
			verifyByEmail();
			break;
		case 5:
			addProduct();
			break;
		case 6:
			findProductByBrand();
			break;
		case 7:
			findProductByCategory();
			break;

		default:
			break;
		}
	}
	
	
	public static void register() {
		System.out.println("Enter the user name,email phone, password to register the user");
		User u = new User();
		u.setName(sc.next());
		u.setEmail(sc.next());
		u.setPhone(sc.nextLong());
		u.setPassword(sc.next());
		u =udao.registerUser(u);
		System.out.println("User register with id : "+u.getId());
		
	}
	public static void update() {
		System.out.println("enter the user id to update");
		int id = sc.nextInt();
		System.out.println("Enter the user name,email phone, password to register the user");
		User u = new User();
		u.setId(id);
		u.setName(sc.next());
		u.setEmail(sc.next());
		u.setPhone(sc.nextLong());
		u.setPassword(sc.next());
		u =udao.updateUser(u);
		if(u!=null) {
			System.out.println("Updated succsfully with id: "+u.getId());
		}
		else {
			System.out.println("Can't update invalid id");
		}
		
		
	}
	public static void verifyByPhone() {
		System.out.println("Enter the phone number and password to verify the user");
		long phone = sc.nextLong();
		String email = sc.next();
		User u = udao.verify(phone, email);
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.out.println("Invalid creadentials provided");
		}
	}
	public static void verifyByEmail() {
		System.out.println("Enter the Email id and password to verify the user");
		String email = sc.next();
		String pass = sc.next();
		User u = udao.verify(email, pass);
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.out.println("Invalid creadentials provided");
		}
	}
	public static void addProduct() {
		System.out.println("Enter the user id to add the product");
		int id = sc.nextInt();
		System.out.println("Enter the product name,descrption, barnd, category,and cost to add the product  ");
		Product p = new Product();
		p.setName(sc.next());
		p.setDescrip(sc.next());
		p.setBrand(sc.next());
		p.setCategory(sc.next());
		p.setCost(sc.nextDouble());
		User u = new User();
//		u.getProducts().add(p);
		p=pdao.addProduct(p);
		System.out.println("Succesfully add product with User id "+id);
		
	}

	
	public static void findProductByCategory() {
		System.out.println("Enter the Product category to fetch the product");
		String category = sc.next();
		List<Product> products = pdao.findByCategory(category);
		if (products.size() > 0) {
			for (Product p : products) {
				System.out.println(p);
			}

		} else {
			System.err.println("No Such Category Available");
		}
	}

	public static void findProductByBrand() {
		System.out.println("Enter the Product brand to fetch the product");
		String brand = sc.next();
		List<Product> products = pdao.findByBrand(brand);
		if (products.size() > 0) {
			for (Product p : products) {
				System.out.println(p);
			}
		} else {
			System.err.println("No Such Brand Available");
		}
	}
	
	
}
