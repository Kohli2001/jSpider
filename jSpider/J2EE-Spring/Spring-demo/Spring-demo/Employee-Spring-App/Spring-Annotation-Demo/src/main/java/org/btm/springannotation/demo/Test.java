package org.btm.springannotation.demo;


import org.jsp.springannotation.demo.Paytm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp", "org.btm");
		Paytm p = context.getBean(Paytm.class);
		p.open();
		Gpay g = context.getBean(Gpay.class);
		g.open();
		

		
		
	}
}
