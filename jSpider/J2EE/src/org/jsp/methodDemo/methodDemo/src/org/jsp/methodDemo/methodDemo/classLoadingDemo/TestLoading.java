package org.jsp.olaFactory;

public class TestLoading {
	public static void main(String[] args) {
		System.out.println("Main starts");
		Demo.hello();
		System.out.println("Main ends");
	}
	static {
		System.out.println("TestLoading class is loaded into JVM memory");
	}
}
class Demo{
	public static void hello() {
		System.out.println("How Are you..");
	}
	static {
		System.out.println("Demo class is loaded into JVM memory");
	}
}
