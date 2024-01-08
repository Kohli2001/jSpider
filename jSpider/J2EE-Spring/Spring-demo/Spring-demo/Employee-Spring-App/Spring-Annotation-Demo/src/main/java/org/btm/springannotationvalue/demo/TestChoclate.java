package org.btm.springannotationvalue.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestChoclate {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.btm.springannotationvalue.demo");
		Body b = context.getBean(Body.class);
		b.getCh().eat();;
	}
}
