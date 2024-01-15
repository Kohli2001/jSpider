package org.jsp.jdbctemplatedemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateUserTable {
	public static void main(String[] args) {
		String  qry="create table User(id int not null, name varchar(45) not null , phone bigint(20) not null unique,password varchar(45) not null)";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		template.execute(qry);
		System.out.println("User table created!");
	}

}
