package org.jsp.jdbctemplatedemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateUser {

	public static void main(String[] args) {
		String qry = "update  User  set name='Ranjan' where id=1";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		int r = template.update(qry);
		System.out.println(r + " row updated");
	}
}
