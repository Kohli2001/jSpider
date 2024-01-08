package org.btm.springannotationvalue.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("org.btm.springannotationvalue.demo");
		Bank b = context.getBean(Bank.class);
		System.out.println("A/C Holder Name: " +b.getAcc_holder_name());
		System.out.println("Bank name: "+b.getBank_name());
		System.out.println("Avlaibale balance: "+b.getBalance());
	}
}
