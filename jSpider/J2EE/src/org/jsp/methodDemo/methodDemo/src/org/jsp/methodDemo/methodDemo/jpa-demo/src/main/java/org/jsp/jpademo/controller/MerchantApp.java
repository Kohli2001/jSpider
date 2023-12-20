package org.jsp.jpademo.controller;

import java.util.Scanner;

import org.jsp.jpademo.dao.MerchantDao;
import org.jsp.jpademo.dto.Merchant;

public class MerchantApp {
	
	 
	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MerchantDao dao = new MerchantDao();
		System.out.println("Press\n1.Register Merchant\n2.Update Merchant\n3.Delete Merchant\n4.Find Merchant by Id");
		int choice= sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("enter the Merchant Name, Phone, Email, Gst Number and Password to Register a Merchant");
			Merchant m = new Merchant();
			m.setName(sc.next());
			m.setPhone(sc.nextLong());
			m.setEmail(sc.next());
			m.setGt_number(sc.next());
			m.setPassword(sc.next());
			
			dao.save(m);
			break;

		default:
			break;
		}
		
	}

}
