package org.jsp.jdbctemplatedemo.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FindUserByphoneAndPass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone and password to fetch the User");
		long phone = sc.nextLong();
		String pass = sc.next();
		String qry = "select * from User where phone=? and password=?";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate temp = context.getBean(JdbcTemplate.class);
		User u = temp.query(qry, new Object[] { phone,pass}, new UserSingleSetExtractor());
		if(u!=null) {
		System.out.println(u);
		}
		else
			System.out.println("Invalid user phone or password");
	}

}
