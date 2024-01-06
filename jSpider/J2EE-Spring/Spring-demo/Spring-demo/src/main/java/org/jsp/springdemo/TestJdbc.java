package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		JdbcProperties p1 = context.getBean("myjdbc", JdbcProperties.class);
		JdbcProperties p2 = context.getBean("yourjdbc", JdbcProperties.class);
		p1.displayProperties();
		System.out.println("------------------------------------");
		p2.displayProperties();
	}
}
