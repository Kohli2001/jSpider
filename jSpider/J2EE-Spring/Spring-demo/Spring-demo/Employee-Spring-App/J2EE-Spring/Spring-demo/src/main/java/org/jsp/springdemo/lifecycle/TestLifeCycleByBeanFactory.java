package org.jsp.springdemo.lifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestLifeCycleByBeanFactory {

	public static void main(String[] args) {
		System.out.println("Test by bean is started ");
		Resource r = new ClassPathResource("lifecycle.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory.getBean("test"));
		System.out.println("Test by bean is ended ");
	}
	
}
