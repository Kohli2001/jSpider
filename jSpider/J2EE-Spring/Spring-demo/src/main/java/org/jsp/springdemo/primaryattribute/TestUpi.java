package org.jsp.springdemo.primaryattribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpi {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("upi.xml");
		UPI u = context.getBean("upi" , UPI.class);
		System.out.println(u.getBank().getBalance());
	}
}
