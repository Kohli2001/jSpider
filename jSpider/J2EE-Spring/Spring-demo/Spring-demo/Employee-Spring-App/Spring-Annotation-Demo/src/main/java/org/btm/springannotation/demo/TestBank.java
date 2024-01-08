package org.btm.springannotation.demo;

import org.jsp.springannotation.demo.ICICI;
import org.jsp.springannotation.demo.Paytm;
import org.jsp.springannotation.demo.SBI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.jsp");
		Paytm p = context.getBean(Paytm.class);
		p.open();
		SBI sbi = context.getBean(SBI.class);
		ICICI icici = context.getBean(ICICI.class);
		sbi.setBalance(45000.00);
		sbi.balance();
		icici.setBalance(89898.00);
		icici.balance();
		
	}
}
