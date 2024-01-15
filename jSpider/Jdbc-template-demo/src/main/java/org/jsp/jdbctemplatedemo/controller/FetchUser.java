package org.jsp.jdbctemplatedemo.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class FetchUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
	List<User> users =template.query("select * from User",new UserResultSetExtractor());
		for(User u: users) {
			System.out.println(u);
		}
		
	}
}
