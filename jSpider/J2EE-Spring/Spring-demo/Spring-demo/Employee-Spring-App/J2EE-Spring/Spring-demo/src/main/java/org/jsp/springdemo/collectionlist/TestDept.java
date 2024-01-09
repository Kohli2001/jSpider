package org.jsp.springdemo.collectionlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");
		Department d = context.getBean("dept",  Department.class);
		System.out.println(d.getNames());
		System.out.println(d.getIds());
		System.out.println(d.getDetails());
		
	}
}
