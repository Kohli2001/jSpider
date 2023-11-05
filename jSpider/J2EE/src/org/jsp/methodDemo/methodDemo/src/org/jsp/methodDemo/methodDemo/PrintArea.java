package org.jsp.methodDemo;

public class PrintArea{
	
	
	
	static void printArea(Shape s) {
		s.area();
	}
	
	public static void main(String[] args) {
		Reactangle r1 = new Reactangle(20.0, 4.0);
		Reactangle r2 = new Reactangle(10.0, 5.0);
		printArea(r1);
		System.out.println("================");
		printArea(r2);
	}

}
