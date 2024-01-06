package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGpay {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Gpay.xml");
		Gpay p1=context.getBean("myGpay", Gpay.class);
		p1.getBank().balance();
		
		Gpay p2=context.getBean("urGpay", Gpay.class);
		p2.getBank().balance();
				
	}
}
