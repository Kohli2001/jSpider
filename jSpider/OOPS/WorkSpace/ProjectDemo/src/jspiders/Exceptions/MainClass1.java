package learningExceptions;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		Demo6 d1 = new Demo6();
		Demo7 d2 = new Demo7();
		Demo6 d3 = new Demo7(); //upcating
		
		d1.display();
		d2.display();
		d3.display();
	}

}
