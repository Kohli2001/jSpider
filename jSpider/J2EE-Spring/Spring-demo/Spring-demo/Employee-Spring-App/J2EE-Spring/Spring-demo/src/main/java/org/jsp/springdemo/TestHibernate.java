package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibernate.xml");
		HibernateProeperties h1 = context.getBean("myhibernate", HibernateProeperties.class);
		HibernateProeperties h2 = context.getBean("yourhibernate", HibernateProeperties.class);
		h1.displayProperties();
		h2.displayProperties();
	}
}
