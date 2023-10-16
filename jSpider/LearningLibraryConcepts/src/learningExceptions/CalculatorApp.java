package learningExceptions;

public class CalculatorApp {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.add(120, 300);
		c1.mul(20, 5);
		
		c1.sub(10, 100);
		c1.divide(100, 0);
		
		
	}

}
