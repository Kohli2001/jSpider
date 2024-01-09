package org.jsp.springdemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleByApplicationContext {

	public static void main(String[] args) {
		System.out.println("testby application context started");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println(context);
		System.out.println("testby application context ended");
	}
}
