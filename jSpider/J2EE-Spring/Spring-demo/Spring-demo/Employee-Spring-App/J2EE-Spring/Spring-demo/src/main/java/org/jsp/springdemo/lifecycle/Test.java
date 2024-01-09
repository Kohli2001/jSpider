package org.jsp.springdemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean , DisposableBean {

	
	static {
		System.out.println("Test class is loaded into JVM");
	}
	
	public Test() {
		System.out.println("Test objcet is instatiated....");
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Test is getting Destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Test object is geeting initialised..");
	}
	
	
}
