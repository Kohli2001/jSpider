package abstraction;

public class Circle implements Shape{
	
	private double radius;

	
	public Circle(double radius) {
		System.out.println("Creating circle with radius of " +radius);
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius;
	}
	

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void  area() {
		
		double area=pi*radius*radius;
		
		System.out.println("Area of Square :" +area);
		
	}
	
	
	

}
