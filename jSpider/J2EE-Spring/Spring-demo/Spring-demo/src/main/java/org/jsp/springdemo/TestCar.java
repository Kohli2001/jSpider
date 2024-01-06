package org.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar {

	
	public static void main(String[] args) {
		Resource r = new ClassPathResource("car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Car c = (Car)factory.getBean("mycar");
//		System.out.println(c);
		c.start();
		
		Car c1 = factory.getBean(Car.class);
		c1.start();
		
		
	}
}
