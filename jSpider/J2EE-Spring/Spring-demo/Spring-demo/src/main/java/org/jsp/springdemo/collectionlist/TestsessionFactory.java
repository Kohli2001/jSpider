package org.jsp.springdemo.collectionlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestsessionFactory {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mydata.xml");
		MySessionFactory data = context.getBean("mysession", MySessionFactory.class);
	
		System.out.println("URL: "+data.getDaatSource().getUrl());
		System.out.println("Driver: "+data.getDaatSource().getDriverClassName());
		System.out.println("User: "+data.getDaatSource().getUsername());
		System.out.println("Password: "+data.getDaatSource().getPassword());
		System.out.println("Hiberante properties"+data.getHibrenateProperties());
		System.out.println("Mapping Resaurce: "+data.getMappingResource());
	}
}
