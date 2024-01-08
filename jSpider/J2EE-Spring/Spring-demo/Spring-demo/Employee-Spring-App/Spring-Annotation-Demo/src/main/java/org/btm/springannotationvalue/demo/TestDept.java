package org.btm.springannotationvalue.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDept {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
		Department d = context.getBean(Department.class);
		System.out.println(d.getName());
		
	}
}
