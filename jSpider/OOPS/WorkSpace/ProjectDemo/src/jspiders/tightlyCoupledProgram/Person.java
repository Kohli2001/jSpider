package tightlyCoupledProgram;

public class Person {
	
	Car c1 = new Car();
	
	void travel() {
		System.out.println("Travelling");
		c1.start();
		c1.move();
		c1.stop();
	}

}
