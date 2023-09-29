package learningExceptions;

public class Demo6 {
		
	void display() {
		System.out.println("Running Display methods");
	}
	
	
}
class Demo7 extends Demo6{
	void display() {
		System.out.println("Overriding display methods");
	}
}
