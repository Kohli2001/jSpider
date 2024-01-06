package org.jsp.springdemo.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRide {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ride.xml");
		Ride r = context.getBean("ride", Ride.class);
		r.getV().start();
		
	}

}
