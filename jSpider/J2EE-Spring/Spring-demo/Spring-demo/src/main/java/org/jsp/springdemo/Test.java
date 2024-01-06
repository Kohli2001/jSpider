package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
//		Resource r = new ClassPathResource("car.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
		
		BeanFactory factory= new XmlBeanFactory(new ClassPathResource("car.xml"));
		BankAccount acc = factory.getBean("account", BankAccount.class);
		acc.balance();
		
		
				
		
	}
}
