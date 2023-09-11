package abstraction;

public class MainClass2 {
	public static void main(String[] args) {
		
		ShapeSimulator ss = new ShapeSimulator();
		
	
		Circle c1 = new Circle(2.3);
		Square s1 = new Square(2.5);
		
		ss.simulator(s1);
		ss.simulator(c1);
	}

}
