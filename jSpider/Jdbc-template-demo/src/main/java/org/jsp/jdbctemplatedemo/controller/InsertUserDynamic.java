package org.jsp.jdbctemplatedemo.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertUserDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id, name, phone, password to save the user");
		int id = sc.nextInt();
		String name = sc.next();
		long phone = sc.nextLong();
		String pass = sc.next();
		String qry ="insert into User values(?,?,?,?)";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate temp = context.getBean(JdbcTemplate.class);
		int r =temp.update(qry,id,name,phone,pass);
		System.out.println(r+ "rows inserted");
		
	}
}
