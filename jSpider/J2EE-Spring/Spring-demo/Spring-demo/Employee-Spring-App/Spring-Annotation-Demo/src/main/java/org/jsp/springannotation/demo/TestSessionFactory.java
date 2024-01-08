package org.jsp.springannotation.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSessionFactory {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SessionFactoryConfiguration.class);
		MySessionFactory factory = context.getBean(MySessionFactory.class);
		System.out.println(factory.getHibernateProperties());
		
	}
}
