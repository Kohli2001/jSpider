package org.jsp.hibernatetemp.controller;

import java.util.Scanner;

import org.jsp.hibernatetemp.dao.MerchantDao;
import org.jsp.hibernatetemp.dto.Merchnat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MerchnatController {

	private static Scanner sc = new Scanner(System.in);
	private static MerchantDao dao;
	
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("merchant-cfg.xml");
		dao= context.getBean(MerchantDao.class);
	}
	
	public static void main(String[] args) {
		System.out.println("1.save merchant\n2.find merchant\n3.delete merchnat");
		
		System.out.println("Enter the choice");
		switch (sc.nextInt()) {
		case 1:
			save();
			break;
		case 2:
			find();
			break;
		case 

		default:
			break;
		}
	}
	public static void save() {
		System.out.println("Enter the name,phone,email,gst , password to save merchant");
		Merchnat m = new Merchnat();
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setEmail(sc.next());
		m.setGst(sc.next());
		m.setPassword(sc.next());
		m = dao.saveMerchant(m);
		System.out.println("merchant saved with id: "+m.getId());
		
	}
	public static void find() {
		System.out.println("Enter the merchnat id to find");
		int id = sc.nextInt();
		Merchnat m = dao.findById(id);
		if(m!=null) {
			System.out.println(m);
		}
		else {
			System.out.println("invalid merchant id");
		}
	}
}
