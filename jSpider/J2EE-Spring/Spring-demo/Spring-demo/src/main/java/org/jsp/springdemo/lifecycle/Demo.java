package org.jsp.springdemo.lifecycle;

public class Demo {


	static {
		System.out.println("Test class is loaded into JVM");
	}
	
	public Demo() {
		System.out.println("Test objcet is instatiated....");
	}

	public void byee() {
		
		System.out.println("Test is getting Destroyed");
	}

	public void hii(){
		System.out.println("Test object is geeting initialised..");
	}
	
	
}
