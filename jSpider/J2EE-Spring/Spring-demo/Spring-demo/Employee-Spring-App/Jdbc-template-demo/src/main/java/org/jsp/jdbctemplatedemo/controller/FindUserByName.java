package org.jsp.jdbctemplatedemo.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FindUserByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to fetch the User");
		String name= sc.next();
		String qry = "select * from User where name=?";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate temp = context.getBean(JdbcTemplate.class);
		List<User> u = temp.query(qry, new Object[] { name }, new UserResultSetExtractor());
		if(u!=null) {
		System.out.println(u);
		}
		else
			System.out.println("Invalid user Id");
	}
}
