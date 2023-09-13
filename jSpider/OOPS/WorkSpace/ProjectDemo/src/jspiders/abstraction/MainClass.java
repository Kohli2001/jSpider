package abstraction;

public class MainClass {
	public static void main(String[] args) {
		
		Demo2 d1 = new Demo2();
		
		System.out.println("m value is " +d1.m);
		System.out.println("n value is "+d1.n);
		   d1.method2();
		  // d1.method1();  // error because it has default access specifiers wich has resitication upto package level
		   
		 
		   
	}

}
