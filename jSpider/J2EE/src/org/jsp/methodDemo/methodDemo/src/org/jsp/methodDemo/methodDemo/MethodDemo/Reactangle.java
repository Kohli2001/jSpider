package org.jsp.methodDemo;

public class Reactangle implements Shape {
	
	double length, bredth;
	
	public Reactangle(double length, double bredth) {
		this.length=length;
		this.bredth=bredth;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area " +length*bredth);
	}
	
	
	

}
