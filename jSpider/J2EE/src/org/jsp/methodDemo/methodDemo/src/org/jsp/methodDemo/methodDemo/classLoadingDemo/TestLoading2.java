package org.jsp.olaFactory;

public class TestLoading2 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
		Class.forName("org.jsp.olafactory.Demo");
		}catch(ClassNotFoundException e) {
			System.out.println("The class name is Incorrect..!!");
		}
		System.out.println("Main ends");
	}
	static {
		System.out.println("TestLoading class is loaded into JVM memory");
	}
}
class Demo1{
	public static void hello() {
		System.out.println("How Are you..");
	}
	static {
		System.out.println("Demo class is loaded into JVM memory");
	}
}
