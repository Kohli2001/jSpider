package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.MerchantProductConfig;
import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dao.ProductDao;
import org.jsp.merchantproductapp.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MerchantProductController {
	
	private static Scanner sc = new Scanner(System.in);
	private static  MerchantDao mdao;
	private static ProductDao pdao;
	
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(MerchantProductConfig.class);
		mdao = context.getBean(MerchantDao.class);
		pdao= context.getBean(ProductDao.class);
	}
	

	public static void main(String[] args) {
		System.out.println("========WELCOME TO MERCHANT PRODUCT APP======================");
		System.out.println("1.Save merchant\n2.Update merchant\n3.find merchant by id\n4.verify by phone\n5.verify by email"
				+ "\n6.Add Product\n7.Update Product\n8.Find product by Merchant id\n9.find product by brand\n10.find product by category");
		
		System.out.println("Enter your choice");
		switch (sc.nextInt()) {
		case 1:
			save();
			
			break;

		default:
			break;
		}
		
		
		
	}
	public static void save() {
		System.out.println("Enter merchant name, phone, email, password to save the merchant");
		Merchant m = new Merchant();
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setPassword(sc.next());
		mdao.saveMerchant(m);
		
	}
}
