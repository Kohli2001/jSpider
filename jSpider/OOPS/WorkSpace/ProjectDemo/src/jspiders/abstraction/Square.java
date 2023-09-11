package abstraction;

public class Square implements Shape{
	
	private double side;
	
	public Square(double side) {
		System.out.println("craeting square with side " +side);
		this.side=side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void area() {
		
		double area = side*side;
		System.out.println("Area of the Square: " +area);
	}
	

}
