package jspiders.p1;

public class Demo2 {
	
	public void disp() {
		
		
		Demo1 d1 = new Demo1();
		
//		System.out.println("valur of var1 is "+d1.var1); // not visible due to private access specifier
		
		System.out.println("value of var2 is "+d1.var2);
		System.out.println("value of var3 is "+d1.var3);
		System.out.println("value of var4 is "+d1.var4);
		
	}

}
